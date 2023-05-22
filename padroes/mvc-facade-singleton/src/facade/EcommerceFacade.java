package facade;

import mvc.Controller;
import mvc.Model;
import mvc.View;

public class EcommerceFacade {
    private Controller controller;

    public EcommerceFacade() {
        Model model = Model.getInstance();
        View view = new View();
        controller = new Controller(model, view);
    }

    public void addItemToCart(String item) {
        controller.addItemToCart(item);
    }

    public void removeItemFromCart(String item) {
        controller.removeItemFromCart(item);
    }

    public void displayCartItems() {
        controller.displayCartItems();
    }
}