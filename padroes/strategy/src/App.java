import java.util.Scanner;

import classes.BoletoBancarioStrategy;
import classes.CartaoCreditoStrategy;
import classes.PagamentoContext;
import classes.PagamentoStrategy;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pagamento com Strategy");
        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();

        System.out.println("Selecione o tipo de pagamento:");
        System.out.println("1. Cartão de Crédito");
        System.out.println("2. Boleto");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        PagamentoStrategy strategy;
        if (opcao == 1) {
            scanner.nextLine(); // Consumir a nova linha pendente
            System.out.print("Digite o número do cartão de crédito: ");
            String numCartao = scanner.nextLine();

            System.out.print("Digite a data de validade do cartão: ");
            String dataValidade = scanner.nextLine();

            System.out.print("Digite o CVV do cartão: ");
            String cvv = scanner.nextLine();

            strategy = new CartaoCreditoStrategy(numCartao, dataValidade, cvv);
        } else if (opcao == 2) {
            scanner.nextLine(); // Consumir a nova linha pendente
            System.out.print("Digite o código de barras do boleto: ");
            String codigoDeBarras = scanner.nextLine();

            strategy = new BoletoBancarioStrategy(codigoDeBarras);
        } else {
            System.out.println("Opção inválida.");
            return;
        }

        PagamentoContext contexto = new PagamentoContext(strategy);
        contexto.pagar(valor);
    }
}
