import java.util.HashMap;

public class Store {

  public HashMap<String, Integer> inventory;

  public Store() {
    inventory = new HashMap<>();
  }

  public void addStock(String name, int initialStock) {
    inventory.put(name, initialStock);
  }

  public void increaseStock(String name, int increase) {
    inventory.put(name, inventory.get(name) + increase);
  }

  public void sellItems(String name, int quantity) {
    if (inventory.containsKey(name) && inventory.get(name) >= quantity){
      inventory.put(name, inventory.get(name) - quantity);
    }
  }

  public void removeItem(String name) {
    inventory.remove(name);
  }

  public int quantity(String name) {

    return inventory.get(name);
  }

  public boolean doWeSell(String name) {

    return inventory.containsKey(name);
  }

  public static void main(String[] args) {
    Store OakensTradingPost = new Store();
    OakensTradingPost.addStock("Carrots", 20);
    OakensTradingPost.addStock("Rope", 5);
    OakensTradingPost.addStock("Pickaxe", 1);

    System.out.println("Do we sell Cheese?: "
        + OakensTradingPost.doWeSell("Cheese"));

    System.out.println("How many ropes do we have?: "
        + OakensTradingPost.quantity("Rope"));

    System.out.println("Sell a rope!");
    OakensTradingPost.sellItems("Rope", 1);

    System.out.println("How many ropes do we have?: "
        + OakensTradingPost.quantity("Rope"));

    System.out.println("How many pickaxes do we have?: "
        + OakensTradingPost.quantity("Pickaxe"));

    System.out.println("Get 5 more pickaxes from our supplier!");
    OakensTradingPost.increaseStock("Pickaxe", 5);

    System.out.println("How many pickaxes do we have?: "
        + OakensTradingPost.quantity("Pickaxe"));
  }

}
