package classes;

import java.util.List;

public class EcommerceFacade {
  private Order order;
    private ShippingService shippingService;

    public EcommerceFacade() {
        order = new Order();
        shippingService = new ShippingService();
    }

    public void addProductToCart(String productName, double price) {
        Product product = new Product(productName, price);
        order.addProduct(product);
        System.out.println("Produto '" + product.getName() + "' adicionado ao carrinho.");
    }

    public void removeProductFromCart(String productName) {
        List<Product> products = order.getProducts();
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                order.removeProduct(product);
                System.out.println("Produto '" + product.getName() + "' removido do carrinho.");
                return;
            }
        }
        System.out.println("Produto '" + productName + "' não encontrado no carrinho.");
    }

    public void checkout() {
        shippingService.shipOrder(order);
        System.out.println("Pedido finalizado.");
    }
}
