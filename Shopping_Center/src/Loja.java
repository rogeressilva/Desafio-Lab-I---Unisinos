public class Loja {


     // Atributos
     private String nome;
     private int quantidadeFuncionarios;
     private double salarioBaseFuncionario;

        
     // Construtor I - Começa tudo
     public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario) {
         this.nome = nome;
         this.quantidadeFuncionarios = quantidadeFuncionarios;
         this.salarioBaseFuncionario = salarioBaseFuncionario;
     }

     // Construtor II - Somente o nome e a quantidade de funcionarios
     public Loja(String nome, int quantidadeFuncionarios) {
         this.nome = nome;
         this.quantidadeFuncionarios = quantidadeFuncionarios;
         this.salarioBaseFuncionario = -1;
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

     // Método para calcular o salário total dos funcionários
     public double gastosComSalario() {
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
    return "Loja: " + nome + ", Quantidade de Funcionários: " + quantidadeFuncionarios + ", Salário Base: R$" + salarioBaseFuncionario;
    }
    
}