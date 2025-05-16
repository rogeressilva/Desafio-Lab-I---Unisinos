//Classe Bijuteria herdando da classe Loja
public class Bijuteria extends Loja {
    
    //Atributos
    private double metaVendas;

    //Contrutor que recebe informações para iniciar os atributos
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, double metaDeVendas, int capacidadeEstoque) {
        super (nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, capacidadeEstoque); //Super chama o construtor da superclasse Loja
        this.metaVendas = 0.0;
    }

    //Getters e Setters
    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaDeVendas) {
        this.metaVendas = metaDeVendas;
    }

    // Sobrescrita do método toString
    @Override
    public String toString() {
        return super.toString() + 
               "\nMeta de Vendas: " + metaVendas;
    }
}
