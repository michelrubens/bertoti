package classes;

public class PagamentoContext {
  private PagamentoStrategy strategy;

  public PagamentoContext(PagamentoStrategy strategy) {
      this.strategy = strategy;
  }

  public void setStrategy(PagamentoStrategy strategy) {
      this.strategy = strategy;
  }

  public void pagar(double valor) {
      this.strategy.pagar(valor);
  }
}