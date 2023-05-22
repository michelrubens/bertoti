package mvc;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private static Model instance;
    private List<String> cartItems;

    private Model() {
        cartItems = new ArrayList<>();
    }

    // Singleton
    public static Model getInstance() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }

    public void addItemToCart(String item) {
        cartItems.add(item);
    }

    public void removeItemFromCart(String item) {
        cartItems.remove(item);
    }

    public List<String> getCartItems() {
        return cartItems;
    }
}