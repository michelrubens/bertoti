package classes;

public class BoletoBancarioStrategy extends PagamentoStrategy {
  private String codigoDeBarras;

    public BoletoBancarioStrategy(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    @Override
    void pagar(double valor) {
        System.out.println("Pagamento de R$" + String.format("%.2f", valor) + " efetuado com boleto bancário " + codigoDeBarras);
    }
}
