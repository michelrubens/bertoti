package classes;

public class TotalObserver implements Observer {
  private CarrinhoCompras cart;

    public TotalObserver(CarrinhoCompras cart) {
        this.cart = cart;
        this.cart.addObserver(this);
    }

    public void update() {
        double total = cart.getTotal();
        System.out.println("Total: R$" + String.format("%.2f", total));
    }
}
