import java.util.Scanner;

import classes.CarrinhoCompras;
import classes.CartObserver;
import classes.TotalObserver;
import classes.Item;

public class App {
    public static void main(String[] args) throws Exception {
        CarrinhoCompras cart = new CarrinhoCompras();
        CartObserver cartObserver = new CartObserver(cart);
        TotalObserver totalObserver = new TotalObserver(cart);

        Item[] produtos = {
                new Item("Camiseta", 29.99),
                new Item("Calça", 59.99),
                new Item("Tênis", 99.99)
        };

        exibirProdutos(produtos);

        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.print("Digite o número do produto para adicionar ao carrinho (ou 0 para sair, -1 para remover um item): ");
            escolha = scanner.nextInt();

            if (escolha > 0 && escolha <= produtos.length) {
                Item produtoEscolhido = produtos[escolha - 1];
                cart.adicionarItem(produtoEscolhido);
                System.out.println("Item adicionado ao carrinho: " + produtoEscolhido.getName());
            } else if (escolha == -1) {
                System.out.print("Digite o número do item para remover do carrinho: ");
                int itemParaRemover = scanner.nextInt();
                if (itemParaRemover > 0 && itemParaRemover <= cart.getItems().size()) {
                    cart.removerItem(itemParaRemover - 1);
                    System.out.println("Item removido do carrinho.");
                } else {
                    System.out.println("Item inválido. Tente novamente.");
                }
            } else if (escolha != 0) {
                System.out.println("Escolha inválida. Tente novamente.");
            }
        } while (escolha != 0);

        cartObserver.update();
        System.out.println("Total: R$" + String.format("%.2f", cart.getTotal()));
    }
    private static void exibirProdutos(Item[] produtos) {
        System.out.println("Produtos disponíveis:");
        for (int i = 0; i < produtos.length; i++) {
            System.out.println((i + 1) + ". " + produtos[i].getName() + " - R$" + String.format("%.2f", produtos[i].getPrice()));
        }
    }
}
