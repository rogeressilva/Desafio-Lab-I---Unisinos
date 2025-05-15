public class Loja {

     // Atributos
     private String nome;
     private int quantidadeFuncionarios;
     private double salarioBaseFuncionario;

     //Atributos já criados que foram adicionados ao atributo Loja
     private Endereco endereco;
     private Data dataDeFundacao;

     //Atributo criado com Array
     private Produto[] estoqueProdutos;

     // Construtor I - Começa tudo
     public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, int capacidadeEstoque) {
         this.nome = nome;
         this.quantidadeFuncionarios = quantidadeFuncionarios;
         this.salarioBaseFuncionario = salarioBaseFuncionario;
         this.endereco = endereco; //Construtor atualizado para receber o atributo Endereco
         this.dataDeFundacao = dataDeFundacao; //Construtor atualizado para receber o atributo Data
         this.estoqueProdutos = new Produto [capacidadeEstoque];
     }

     // Construtor II - Somente o nome e a quantidade de funcionarios
     public Loja(String nome, int quantidadeFuncionarios) {
         this.nome = nome;
         this.quantidadeFuncionarios = quantidadeFuncionarios;
         this.salarioBaseFuncionario = -1;
         this.endereco = null; //Construtor atualizado para receber o atributo Endereco, porém esse contrutor deve receber somente os atributos nome e quantidade de funcionarios
         this.dataDeFundacao = null; //Construtor atualizado para receber o atributo Data, porém esse contrutor deve receber somente os atributos nome e quantidade de funcionarios
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
    
    // Método toString para exibir as informações da loja
     @Override
    public String toString() {
    return "Loja: " + nome + ", Quantidade de Funcionários: " + quantidadeFuncionarios + ", Salário Base: R$" + salarioBaseFuncionario + ", Endereço: " + endereco + ", Data de Fundação: " + dataDeFundacao;
    }
    
}