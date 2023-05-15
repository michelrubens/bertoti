import classes.EcommerceFacade;

public class App {
    public static void main(String[] args) throws Exception {
        EcommerceFacade ecommerce = new EcommerceFacade();

        ecommerce.addProductToCart("Camiseta", 29.99);
        ecommerce.addProductToCart("Calça", 59.99);
        ecommerce.addProductToCart("Tênis", 99.99);

        ecommerce.removeProductFromCart("Calça");
        ecommerce.removeProductFromCart("Meia"); // Produto não existente no carrinho

        ecommerce.checkout();
    }
}
