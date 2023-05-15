package classes;

import java.util.List;

public class CartObserver implements Observer {
  private CarrinhoCompras cart;

  public CartObserver(CarrinhoCompras cart) {
    this.cart = cart;
    this.cart.addObserver(this);
  }

  public void update() {
    StringBuilder items = new StringBuilder();
    List<Item> cartItems = cart.getItems();
    for (int i = 0; i < cartItems.size(); i++) {
      Item item = cartItems.get(i);
      items.append("Item ").append(i + 1).append(": ").append(item.getName()).append(" - R$")
          .append(String.format("%.2f", item.getPrice())).append("\n");
    }

    String cartItemsString = items.toString();
    if (cartItemsString.isEmpty()) {
      cartItemsString = "Nenhum item no carrinho";
    }

    System.out.println("Carrinho de compras:");
    System.out.println(cartItemsString);
  }

}
