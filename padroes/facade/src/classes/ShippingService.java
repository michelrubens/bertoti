package classes;

public class ShippingService {
  public void shipOrder(Order order) {
    // Lógica para processar o envio do pedido
    System.out.println("Pedido enviado: " + order.getProducts().size() + " produto(s) enviado(s).");
}
}
