//Classe Informatica herdando da classe Loja
public class Informatica extends Loja{
    
    //Atributos
    private double seguroEletronicos;

    //Contrutor que recebe informações para iniciar os atributos
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, double seguroEletronicos) {
        super (nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao); //Super chama o construtor da superclasse Loja
        this.seguroEletronicos = seguroEletronicos;
    }

    //Getters e Setters
    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    // Sobrescrita do método toString
    @Override
    public String toString() {
        return super.toString() + 
               String.format("\nSeguro de Eletrônicos: R$ %.2f", seguroEletronicos); //O uso de String.format() com %.2f garante que o valor será exibido com 2 casas decimais 
    }
}
