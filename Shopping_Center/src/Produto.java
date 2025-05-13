public class Produto {
    
    //Atributos
    private String nome;
    private double preco;  
    
    //Atributos já criados que foram adicionados ao atributo Produto
    private Data dataValidade;

    //Construtor para receber os atributos
    public Produto (String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade; //Construtor atualizado para receber o atributo Data
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //Getters e Setters do atributo adicionado Data

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    // Método toString para exibir as informações do produto
     @Override
    public String toString() {
    return "Produto: " + nome + ", Preço: R$" + preco;
    }
}
