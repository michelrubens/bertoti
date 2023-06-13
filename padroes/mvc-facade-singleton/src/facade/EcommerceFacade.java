package facade;

import mvc.Model;
import mvc.View;

public class EcommerceFacade {
    private Model model;
    private View view;

    public EcommerceFacade() {
        model = Model.getInstance();
        view = new View();
    }

    public void addItemToCart(String item) {
        model.addItemToCart(item);
    }

    public void removeItemFromCart(String item) {
        model.removeItemFromCart(item);
    }

    public void displayCartItems() {
        view.displayCartItems(model.getCartItems());
    }
}