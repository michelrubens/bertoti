package mvc;

import java.util.List;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void addItemToCart(String item) {
        model.addItemToCart(item);
    }

    public void removeItemFromCart(String item) {
        model.removeItemFromCart(item);
    }

    public void displayCartItems() {
        List<String> items = model.getCartItems();
        view.displayCartItems(items);
    }
}