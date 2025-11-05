import java.util.HashMap;

public class Store {
  HashMap<String, Integer> inventory;

  public Store() {
    inventory = new HashMap<>();
  }

  public void initialStock(String item, int quantity) {
    inventory.put(item, quantity);
  }
  public void addStock(String item, int quantity) {
    inventory.put(item, inventory.get(item) + quantity);
  }
  public void sellItems(String item, int quantity) {
    if (inventory.containsKey(item) && inventory.get(item) >= quantity) {
      inventory.put(item, inventory.get(item) - quantity);
    }
  }
  public int getQuantity(String item) {
    return inventory.get(item);
  }
  public boolean doWeSell(String item) {
    return inventory.containsKey(item);
  }
  public void discontinue(String item) {
    inventory.remove(item);
  }

  public static void main(String[] agrs) {
    Store myStore = new Store();
    myStore.initialStock("Apple", 100);
    myStore.initialStock("Orange", 50);
    myStore.initialStock("Banana", 20);

    System.out.println("Do we sell apples? " + myStore.doWeSell("Apple"));
    System.out.println("Do we sell grapes? " + myStore.doWeSell("Grape"));
    System.out.println("How many oranges do we have? " + myStore.getQuantity("Orange"));
    System.out.println("Sell 45 Oranges!");
    myStore.sellItems("Orange", 45);
    System.out.println("How many oranges do we have? " + myStore.getQuantity("Orange"));
    System.out.println("Discontinue Apples!");
    myStore.discontinue("Apple");
    System.out.println("Do we sell apples? " + myStore.doWeSell("Apple"));


    System.out.println("Apple".hashCode());

    int hash = 0;
    for (char c : "Apple".toCharArray()) {
      hash = 31 * hash + (int) c;
    }
    System.out.println(hash);

  }

}
