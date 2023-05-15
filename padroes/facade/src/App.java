import classes.EcommerceFacade;

public class App {
    public static void main(String[] args) throws Exception {
        EcommerceFacade ecommerce = new EcommerceFacade();

        ecommerce.addProductToCart("Camiseta", 29.99);
        ecommerce.addProductToCart("Cal�a", 59.99);
        ecommerce.addProductToCart("T�nis", 99.99);

        ecommerce.removeProductFromCart("Cal�a");
        ecommerce.removeProductFromCart("Meia"); // Produto n�o existente no carrinho

        ecommerce.checkout();
    }
}
