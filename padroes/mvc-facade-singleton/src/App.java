import java.util.Scanner;
import facade.EcommerceFacade; // Importação da classe facade

public class App {
    public static void main(String[] args) throws Exception {
        // Instância da classe EcommerceFacade
        EcommerceFacade ecommerce = new EcommerceFacade();

        // Criação do objeto Scanner para leitura das opções do usuário
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        // Loop do menu interativo
        while (option != 4) {
            System.out.println("===== Menu =====");
            System.out.println("1. Adicionar item ao carrinho");
            System.out.println("2. Remover item do carrinho");
            System.out.println("3. Exibir itens do carrinho");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    // Adicição de itens ao carrinho
                    System.out.print("Digite o nome do produto: ");
                    String productName = scanner.next();
                    ecommerce.addItemToCart(productName);
                    System.out.println("Item '" + productName + "' adicionado ao carrinho.");
                    break;

                case 2:
                    // Remoção de itens do carrinho
                    System.out.print("Digite o nome do produto a ser removido: ");
                    String productToRemove = scanner.next();
                    ecommerce.removeItemFromCart(productToRemove);
                    System.out.println("Item '" + productToRemove + "' removido do carrinho.");
                    break;

                case 3:
                    // Exibição dos itens do carrinho
                    ecommerce.displayCartItems();
                    /*
                     * O controlador (Controller) recebe essa solicitação, obtém os itens do modelo
                     * (Model) e os envia para a visualização (View), que os exibe no console.
                     */
                    break;

                case 4:
                    System.out.println("Encerrando o programa. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
            System.out.println();
        }
        // Fechamento do objeto Scanner
        scanner.close();
    }
}
