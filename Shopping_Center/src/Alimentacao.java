//Classe Alimentacao herdando da classe Loja
public class Alimentacao extends Loja{

    //Atributos
    private Data dataAlvara;

    //Contrutor que recebe informações para iniciar os atributos
    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, Data dataAlvara, int capacidadeEstoque) {
        super (nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, capacidadeEstoque); //Super chama o construtor da superclasse Loja
        this.dataAlvara = dataAlvara;
    }

    //Getters e Setters
    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }
    
    // Sobrescrita do método toString
    @Override
    public String toString() {
        return super.toString() + 
               "\nData do recebimento do Alvará: " + dataAlvara;
    }
}
