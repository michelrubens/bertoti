package classes;

public class CartaoCreditoStrategy extends PagamentoStrategy {
  private String numCartao;
    private String dataValidade;
    private String cvv;

    public CartaoCreditoStrategy(String numCartao, String dataValidade, String cvv) {
      this.numCartao = numCartao;
      this.dataValidade = dataValidade;
      this.cvv = cvv;
  }

    @Override
    void pagar(double valor) {
        System.out.println("Pagamento de R$" + String.format("%.2f", valor) + " efetuado com cartão de crédito " + numCartao);
    }
}
