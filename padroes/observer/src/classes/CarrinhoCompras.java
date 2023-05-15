package classes;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
  private List<Item> items;
  private List<Observer> observers;

  public CarrinhoCompras() {
    this.items = new ArrayList<>();
    this.observers = new ArrayList<>();
  }

  public void adicionarItem(Item item) {
    items.add(item);
    notifyObservers();
  }

  public void removerItem(int index) {
    items.remove(index);
    notifyObservers();
  }

  public double getTotal() {
    double total = 0;
    for (Item item : items) {
      total += item.getPrice();
    }
    return total;
  }

  public void addObserver(Observer observer) {
    observers.add(observer);
  }

  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  private void notifyObservers() {
    for (Observer observer : observers) {
      observer.update();
    }
  }

  public List<Item> getItems() {
    return new ArrayList<>(items);
  }
}
