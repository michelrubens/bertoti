import java.util.Scanner;
import classes.Item;
import classes.ShoppingCart;

public class App {
    private static ShoppingCart cart = ShoppingCart.getInstance();

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (choice) {
                case 1:
                    addItemToCart(scanner);
                    break;
                case 2:
                    removeItemFromCart(scanner);
                    break;
                case 3:
                    displayCart();
                    break;
                case 4:
                    displayTotal();
                    break;
                case 5:
                    clearCart();
                    break;
                case 0:
                    System.out.println("Encerrando o programa. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (choice != 0);
        
        scanner.close();
    }
    private static void displayMenu() {
        System.out.println("========== MENU ==========");
        System.out.println("1. Adicionar item ao carrinho");
        System.out.println("2. Remover item do carrinho");
        System.out.println("3. Exibir carrinho de compras");
        System.out.println("4. Exibir total");
        System.out.println("5. Limpar carrinho de compras");
        System.out.println("0. Encerrar o programa");
        System.out.println("==========================");
        System.out.print("Escolha uma opção: ");
    }

    private static void addItemToCart(Scanner scanner) {
        System.out.print("Digite o nome do item: ");
        String name = scanner.nextLine();
        System.out.print("Digite o preço do item: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer

        Item item = new Item(name, price);
        cart.addItem(item);

        System.out.println("Item adicionado ao carrinho: " + item.getName());
        System.out.println();
    }

    private static void removeItemFromCart(Scanner scanner) {
        System.out.print("Digite o nome do item a ser removido: ");
        String name = scanner.nextLine();

        // Verifica se o carrinho contém o item com o nome fornecido
        for (Item item : cart.getItems()) {
            if (item.getName().equals(name)) {
                cart.removeItem(item);
                System.out.println("Item removido do carrinho: " + item.getName());
                System.out.println();
                return;
            }
        }

        System.out.println("Item não encontrado no carrinho.");
        System.out.println();
    }

    private static void displayCart() {
        System.out.println("Carrinho de compras:");
        for (Item item : cart.getItems()) {
            System.out.println(" - " + item.getName() + " - R$" + String.format("%.2f", item.getPrice()));
        }
        System.out.println();
    }

    private static void displayTotal() {
        System.out.println("Total: R$" + String.format("%.2f", cart.getTotal()));
        System.out.println();
    }

    private static void clearCart() {
        cart.clear();
        System.out.println("Carrinho de compras limpo.");
        System.out.println();
    }
}
