import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Map;

public class Store {

  HashMap<String, Integer> inventory;

  Store() {
    inventory = new HashMap<>();
  }

  void initialStock(String item, int quantity) {
    System.out.println("Adding an initial stock of " + quantity + " " + item + "s.");
    inventory.put(item, quantity);
  }

  void addStock(String item, int quantity) {
    System.out.println("Adding " + quantity + " " + item + "s to our stock.");
    int curStock = inventory.containsKey(item) ? inventory.get(item) : 0;
    inventory.put(item, curStock+quantity);
  }

  public boolean doWeSell(String item) {
    boolean doWe = inventory.containsKey(item);
    System.out.println("We " + (doWe ? "do" : "do not") + " sell " + item + "s.");
    return doWe;
  }

  void sellItem(String item, int quantity) {
    if(inventory.containsKey(item)) {
      if (quantity <= inventory.get(item)) {
        System.out.println("Selling " + quantity + " " + item + "s.");
        inventory.put(item, inventory.get(item) - quantity);
      } else {
        System.out.println("Not enough " + item + "s to provide " + quantity + ". Selling "
            + inventory.get(item) + " instead");
        inventory.put(item, 0);
      }
    } else {
      System.out.println("We do not even sell " + item + "s.");
    }
  }

  public void removeStock(String item) {
    System.out.println("Removing all " + item + "s from stock.");
    inventory.remove(item);
  }

  public int getStock(String item) {
    int stock = 0;
    if(inventory.containsKey(item)) {
      System.out.println("We currently have " + inventory.get(item) + " " + item + "s in stock.");
      stock = inventory.get(item);
    } else {
      System.out.println("We do not currently carry " + item + "s.");
    }
    return stock;
  }

  public void printInventory() {
    System.out.println("Store Inventory");
    for (Map.Entry<String, Integer> item : inventory.entrySet()) {
      System.out.printf("%8s - Qty: %2d%n", item.getKey(), item.getValue());
    }
  }

  public static void main(String[] args) {
    Store s = new Store();
    s.initialStock("Apple", 10);
    s.initialStock("Orange", 20);
    s.initialStock("Banana", 15);
    s.initialStock("Kiwi", 7);
    s.printInventory();

    s.doWeSell("Banana");
    s.doWeSell("Egg");

    s.sellItem("Banana", 10);
    s.sellItem("Banana", 10);


    s.addStock("Banana", 3);
    s.printInventory();

    s.sellItem("Egg", 2);
    s.sellItem("Orange", 1);

    s.printInventory();


  }
}