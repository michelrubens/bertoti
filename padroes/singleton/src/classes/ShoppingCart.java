package classes;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
  private static ShoppingCart instance;
  private List<Item> items;

  private ShoppingCart() {
      items = new ArrayList<>();
  }

  public static ShoppingCart getInstance() {
      if (instance == null) {
          instance = new ShoppingCart();
      }
      return instance;
  }

  public void addItem(Item item) {
      items.add(item);
  }

  public void removeItem(Item item) {
      items.remove(item);
  }

  public List<Item> getItems() {
      return items;
  }

  public void clear() {
      items.clear();
  }

  public double getTotal() {
      double total = 0;
      for (Item item : items) {
          total += item.getPrice();
      }
      return total;
  }
}