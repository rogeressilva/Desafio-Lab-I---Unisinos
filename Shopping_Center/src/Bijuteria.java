//Classe Bijuteria herdando da classe Loja
public class Bijuteria extends Loja {
    
    //Atributos
    private double metaDeVendas;

    //Contrutor que recebe informações para iniciar os atributos
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, double metaDeVendas) {
        super (nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao); //Super chama o construtor da superclasse Loja
        this.metaDeVendas = 0.0;
    }

    //Getters e Setters
    public double getMetaDeVendas() {
        return metaDeVendas;
    }

    public void setMetaDeVendas(double metaDeVendas) {
        this.metaDeVendas = metaDeVendas;
    }

    @Override
    public String toString() {
        return super.toString() + 
               "\nMeta de Vendas: " + metaDeVendas;
    }
}
