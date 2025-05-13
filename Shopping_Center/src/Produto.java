public class Produto {
    
    //Atributos
    private String nome;
    private double preco;    

    //Construtor para receber os atributos
    public Produto (String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
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

    // Método toString para exibir as informações do produto
     @Override
    public String toString() {
    return "Produto: " + nome + ", Preço: R$" + preco;
    }
}
