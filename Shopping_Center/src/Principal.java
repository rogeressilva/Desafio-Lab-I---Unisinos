import java.util.Scanner;

public class Principal {
    private static Scanner scanner = new Scanner(System.in);
    private static Loja loja = null;
    private static Produto produto = null;
    private static final Data DATA_REFERENCIA = new Data(20, 10, 2023);

    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenu();
            opcao = lerInteiro("Digite uma opção: ");
            
            switch (opcao) {
                case 1:
                    loja = criarLoja();
                    break;
                case 2:
                    produto = criarProduto();
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            
            if (loja != null && produto != null) {
                verificarProdutoELoja();
            }
            
        } while (opcao != 3);
    }

    private static void exibirMenu() {
        System.out.println("\n==== MENU ====");
        System.out.println("(1) Criar uma loja");
        System.out.println("(2) Criar um produto");
        System.out.println("(3) Sair");
    }

    private static Loja criarLoja() {
        System.out.println("\n--- Criação de Loja ---");
        String nome = lerString("Nome da loja: ");
        int quantidadeFuncionarios = lerInteiro("Quantidade de funcionários: ");
        double salarioBase = lerDouble("Salário base: ");
        
        System.out.println("\n--- Endereço da Loja ---");
        String rua = lerString("Rua: ");
        String cidade = lerString("Cidade: ");
        String estado = lerString("Estado: ");
        String cep = lerString("CEP: ");
        String pais = lerString("País: ");
        String numero = lerString("Número: ");
        String complemento = lerString("Complemento: ");
        Endereco endereco = new Endereco(rua, cidade, estado, cep, numero, pais, complemento);
        
        System.out.println("\n--- Data de Fundação ---");
        int dia = lerInteiro("Dia: ");
        int mes = lerInteiro("Mês: ");
        int ano = lerInteiro("Ano: ");
        Data dataFundacao = new Data(dia, mes, ano);
        
        return new Loja(nome, quantidadeFuncionarios, salarioBase, endereco, dataFundacao);
    }

    private static Produto criarProduto() {
        System.out.println("\n--- Criação de Produto ---");
        String nome = lerString("Nome do produto: ");
        double preco = lerDouble("Preço: ");
        
        System.out.println("\n--- Data de Validade ---");
        int dia = lerInteiro("Dia: ");
        int mes = lerInteiro("Mês: ");
        int ano = lerInteiro("Ano: ");
        Data dataValidade = new Data(dia, mes, ano);
        
        return new Produto(nome, preco, dataValidade);
    }

    private static void verificarProdutoELoja() {
        System.out.println("\n=== RESULTADOS ===");
        
        // Verificar produto
        if (produto.estaVencido(DATA_REFERENCIA)) {
            System.out.println("PRODUTO VENCIDO");
        } else {
            System.out.println("PRODUTO NÃO VENCIDO");
        }
        
        // Mostrar informações da loja
        System.out.println("\n=== INFORMAÇÕES DA LOJA ===");
        System.out.println("Nome: " + loja.getNome());
        System.out.println("Quantidade de Funcionários: " + loja.getQuantidadeFuncionarios());
        System.out.println("Salário Base: " + loja.getSalarioBaseFuncionario());
        
        Endereco endereco = loja.getEndereco();
        System.out.println("Endereço: " + endereco.getRua() + ", " + 
                          endereco.getCidade() + " - " + endereco.getEstado() + 
                          " CEP: " + endereco.getCep());
        
        Data dataFundacao = loja.getDataDeFundacao();
        System.out.println("Data de Fundação: " + dataFundacao.getDia() + "/" + 
                         dataFundacao.getMes() + "/" + dataFundacao.getAno());
    }

    // Métodos auxiliares para leitura de dados
    private static String lerString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    private static int lerInteiro(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido! Digite um número inteiro.");
            }
        }
    }

    private static double lerDouble(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido! Digite um número decimal.");
            }
        }
    }
}