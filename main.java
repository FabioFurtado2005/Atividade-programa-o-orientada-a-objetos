import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados iniciais do produto
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite a quantidade no estoque: ");
        int quantidadeNoEstoque = scanner.nextInt();

        // Criação do objeto Produto
        Produto produto = new Produto(nome, preco, quantidadeNoEstoque);

        // Mostrar dados iniciais do produto
        System.out.println("\nDados iniciais do produto:");
        produto.mostrarDados();

        // Entrada no estoque
        System.out.print("\nDigite a quantidade para adicionar ao estoque: ");
        int quantidadeAdicionar = scanner.nextInt();
        produto.adicionarEstoque(quantidadeAdicionar);

        // Mostrar dados após adição
        System.out.println("\nDados após adição ao estoque:");
        produto.mostrarDados();

        // Saída do estoque
        System.out.print("\nDigite a quantidade para remover do estoque: ");
        int quantidadeRemover = scanner.nextInt();
        produto.removerEstoque(quantidadeRemover);

        // Mostrar dados após remoção
        System.out.println("\nDados após remoção do estoque:");
        produto.mostrarDados();

        scanner.close();
    }
}

