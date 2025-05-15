//Classe Vestuario herdando da classe Loja
public class Vestuario extends Loja {
    
    //Atributos
    private boolean produtosImportados; 

    //Contrutor que recebe informações para iniciar os atributos
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao,boolean produtosImportados) {
        super (nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao); //Super chama o construtor da superclasse Loja
        this.produtosImportados = produtosImportados;
    }

    //Getters e Setters
    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    // Sobrescrita do método toString com if-else, para verificar se tem produtos importados
    @Override 
    public String toString() {
        String temImportado;
        
        if (produtosImportados) {
           temImportado = "Sim";
        } else {
            temImportado = "Não";
        }
        
        return super.toString() + "\nVende produtos importados: " + temImportado;
    }
}
