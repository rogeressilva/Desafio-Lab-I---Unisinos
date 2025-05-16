
//Classe Cosmetico herdando da classe Loja
public class Cosmetico extends Loja {

    //Atributos
    private double taxaComercializacao; 

    //Contrutor que recebe informações para iniciar os atributos
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, double taxaComercializacao, int capacidadeEstoque) {
        super (nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, capacidadeEstoque); //Super chama o construtor da superclasse Loja
        this.taxaComercializacao = taxaComercializacao;
    }

     //Getters e Setters
    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    // Sobrescrita do método toString
    @Override
    public String toString() {
        return super.toString() + 
               "\nTaxa de Comercialização: " + taxaComercializacao + "%";
    }
}
