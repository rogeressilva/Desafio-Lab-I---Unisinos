public class Shopping {

    //Atributos iniciais
    private String nome;
    private Endereco endereco;
    private Loja[] lojas; //Atributo é um array de Loja
    private int quantidadeLojas;

    // Construtor
    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
        this.quantidadeLojas = 0;
    }

    // Método para adicionar uma loja ao shopping
    public boolean insereLoja(Loja loja) {
        if (loja == null || quantidadeLojas >= lojas.length) {
            return false;
    }
    
    // Insere na próxima posição disponível
    lojas[quantidadeLojas] = loja;
        quantidadeLojas++;
        return true;
    }

    //Método para remover uma loja do shopping
    public boolean removeLoja(String nomeLoja) {
        if (nomeLoja == null || nomeLoja.trim().isEmpty()) {
            return false;
        }

        for (int i = 0; i < quantidadeLojas; i++) {
            if (lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(nomeLoja.trim())) { //Usando trim() para remover espaços em branco
                lojas[i] = null;
                quantidadeLojas--;
                return true;
            }
        }
        return false;
     }

     //Método para verificar a quantidade de Lojas por tipo
     public int quantidadeLojasPorTipo(String tipoLoja) {
        // Verifica se o tipo é válido
        if (!validarTipoLoja(tipoLoja)) {
            return -1;
        }

        int contador = 0;
        
        // Percorre todas as lojas
        for (int i = 0; i < quantidadeLojas; i++) {
            if (lojas[i] != null && lojas[i].getTipo().equalsIgnoreCase(tipoLoja.trim())) {
                contador++;
            }
        }
        
        return contador;
    }

    // Método auxiliar para validar os tipos de loja
    private boolean validarTipoLoja(String tipo) {
        if (tipo == null) return false;
        
        String tipoNormalizado = tipo.trim().toLowerCase();
        return tipoNormalizado.equals("cosmético") || 
            tipoNormalizado.equals("cosmetico") ||
            tipoNormalizado.equals("vestuário") ||
            tipoNormalizado.equals("vestuario") ||
            tipoNormalizado.equals("bijuteria") ||
            tipoNormalizado.equals("alimentação") ||
            tipoNormalizado.equals("alimentacao") ||
            tipoNormalizado.equals("informática") ||
            tipoNormalizado.equals("informatica");
    }

    //Método para identificar qual loja tem o seguro mais caro
    public Loja lojaSeguroMaisCaro() {
        Loja lojaMaisCara = null;
        double maiorValorSeguro = -1;
    
    // Percorre todas as lojas
    for (int i = 0; i < quantidadeLojas; i++) {
        Loja lojaAtual = lojas[i];
        
        // Verifica se é uma loja de Informática e tem seguro
        if (lojaAtual != null && 
            lojaAtual.getTipo().equalsIgnoreCase("Informática") && 
            lojaAtual.getValorSeguroEletronicos() > 0) {
            
            // Compara o valor do seguro
            if (lojaAtual.getValorSeguroEletronicos() > maiorValorSeguro) {
                maiorValorSeguro = lojaAtual.getValorSeguroEletronicos();
                lojaMaisCara = lojaAtual;
            }
        }
    }
    
    return lojaMaisCara;
 }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public int getQuantidadeLojas() {
        return quantidadeLojas;
    }

    public void setQuantidadeLojas(int quantidadeLojas) {
        this.quantidadeLojas = quantidadeLojas;
    }

    // Método toString para exibir as informações do Shopping
    @Override
    public String toString() {
    return "Loja: " + nome + ", Endereço: " + endereco + ", Quantidade de Lojas: " + quantidadeLojas + ", Lojas: " + lojas;
    }
}
