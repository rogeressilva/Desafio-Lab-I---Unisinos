public class Loja {

     // Atributos iniciais
     private String nome;
     private int quantidadeFuncionarios;
     private double salarioBaseFuncionario;

     //Atributos já criados que foram adicionados ao atributo Loja
     private Endereco endereco;
     private Data dataDeFundacao;

     //Atributo criado com Array
     private Produto[] estoqueProdutos;
     private int estoqueAtual = 0;


     // Construtor I - Começa tudo
     public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, int capacidadeEstoque) {
         this.nome = nome;
         this.quantidadeFuncionarios = quantidadeFuncionarios;
         this.salarioBaseFuncionario = salarioBaseFuncionario;
         this.endereco = endereco; //Construtor atualizado para receber o atributo Endereco
         this.dataDeFundacao = dataDeFundacao; //Construtor atualizado para receber o atributo Data
         this.estoqueProdutos = new Produto [capacidadeEstoque]; //Construtor atualizado para informar a quantidade maxima de produtos
     }

     // Construtor II - Somente o nome e a quantidade de funcionarios
     public Loja(String nome, int quantidadeFuncionarios) {
         this.nome = nome;
         this.quantidadeFuncionarios = quantidadeFuncionarios;
         this.salarioBaseFuncionario = -1;
         this.endereco = null; //Construtor atualizado para receber o atributo Endereco, porém esse contrutor deve receber somente os atributos nome e quantidade de funcionarios
         this.dataDeFundacao = null; //Construtor atualizado para receber o atributo Data, porém esse contrutor deve receber somente os atributos nome e quantidade de funcionarios
     }

     //Métodos para imprimir as informações dos produtos da Loja
     public void imprimirProdutos () {
        System.out.println ("--PRODUTOS DA LOJA--");

        if (estoqueAtual == 0) {
            System.out.println ("Sem produtos no estoque");
        }

        //Loop em for para percorrer os produtos no estoque
        for (int p = 0; p < estoqueAtual; p++) {
            Produto produto = estoqueProdutos [p];
            System.out.println("Produto #" + (p + 1) + ":");

             // Imprime as informações do produto
            System.out.println(produto.toString());
            
            System.out.println("-----------------"); //Linha de separação
        }      

        //Imprime a quantidade de produtos no estoque e a capacidade total
        System.out.println("Total de produtos: " + estoqueAtual + "/" + estoqueProdutos.length);
     }

     // Método para inserir um produto no estoque
     public boolean insereProduto(Produto produto) {
     // Verifica se o produto é válido
     if (produto == null) {
        return false;
     }
    
     // Procura a primeira posição nula no array
     for (int p = 0; p < estoqueProdutos.length; p++) {
        if (estoqueProdutos[p] == null) {
            estoqueProdutos[p] = produto;
            estoqueAtual++;
            return true;
        }
     }
    
     // Se não encontrou posição livre
     return false;
     }

     //Método para remover um produto do estoque
     public boolean removeProduto(String nomeProduto) {
        // Verifica se o nome do produto não é nulo ou vazio
        if (nomeProduto == null || nomeProduto.isEmpty()) {
        return false;
        }

        // Percorre o array até o estoqueAtual (não até o final do array)
        for (int p = 0; p < estoqueAtual; p++) {
            if (estoqueProdutos[p] != null && estoqueProdutos[p].getNome().equalsIgnoreCase(nomeProduto)) {
                // Remove o produto movendo os elementos posteriores
                for (int j = p; j < estoqueAtual - 1; j++) {
                    estoqueProdutos[j] = estoqueProdutos[j + 1];
                }
                // Limpa a última posição e diminui o contador
                estoqueProdutos[estoqueAtual - 1] = null;
                estoqueAtual--;
                return true;
            }
        }
        return false;
     }

     //Getters e Setters
     public String getNome() {
        return nome;
     }

     public void setNome(String nome) {
          this.nome = nome;
     }

     public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
     }

     public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
     }

     public double getSalarioBaseFuncionario() {
         return salarioBaseFuncionario;
     }

       public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
         this.salarioBaseFuncionario = salarioBaseFuncionario;
     }

     //Getters e Setters dos atributos adicionados Endereco e Data
      public Endereco getEndereco() {
        return endereco;
     }

     public void setEndereco(Endereco endereco) {
         this.endereco = endereco;
     }

     public Data getDataDeFundacao() {
         return dataDeFundacao;
     }

     public void setDataDeFundacao(Data dataDeFundacao) {
         this.dataDeFundacao = dataDeFundacao;
     }

     //Getters e Setters do atributo Produto
      public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
     }

     public void setEstoqueProdutos(Produto[] estoqueProdutos) {
         this.estoqueProdutos = estoqueProdutos;
     }

     public int getEstoqueAtual() {
        return estoqueAtual;
     }

     public void setEstoqueAtual(int estoqueAtual) {
         this.estoqueAtual = estoqueAtual;
     }

     // Método para calcular o salário total dos funcionários
     public double calcularSalarioTotalFuncionarios() {
         if (salarioBaseFuncionario < 0) {
            return -1; // Retorna -1 se o salário base não foi definido
         }
          return quantidadeFuncionarios * salarioBaseFuncionario; //Calcula o gasto total com salários
     }

     // Método para verificar o tamanho da loja
     public char tamanhoDaLoja () {
         if (quantidadeFuncionarios < 10) {
            return 'P';
         } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 50) {
             return 'M';
         } else {
             return 'G';
         }
     }  

    // Método Tipo
     public String getTipo() {
        return "Loja";
    }

    // Método para verificar se a loja é de informática
    public int getValorSeguroEletronicos () {
        return 0;
    }
    
    // Método toString para exibir as informações da loja
    @Override
    public String toString() {
    return "Loja: " + nome + ", Quantidade de Funcionários: " + quantidadeFuncionarios + ", Salário Base: R$" + salarioBaseFuncionario + ", Endereço: " + endereco + ", Data de Fundação: " + dataDeFundacao + ", Estoque de Produtos: " + estoqueProdutos;
    }
    
}
