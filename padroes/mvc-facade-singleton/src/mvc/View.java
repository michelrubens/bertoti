package mvc;

import java.util.List;

public class View {
    public void displayCartItems(List<String> items) {
        System.out.println("Itens do carrinho:");
        for (String item : items) {
            System.out.println(item);
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}