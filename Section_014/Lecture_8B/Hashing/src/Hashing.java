import java.util.HashMap;

public class Hashing {

  public static class Monster {
    String name;
    boolean undead;
    int age;

    public Monster(String name, boolean undead, int age){
      this.name = name;
      this.undead = undead;
      this.age = age;
    }

    @Override
    public String toString() {
      return age + " year old " + (undead ? "undead" : "living")
          + " monster named " + name;
    }

  }


  public static void main(String[] args) {

    HashMap<String, Monster> monsters = new HashMap<>();
    monsters.put("ex-human", new Monster("Frankenstein", true, 3));
    monsters.put("vampire", new Monster("Dracula", true, 456));
    monsters.put("werewolf", new Monster("Teen Wolf", false, 16));

    System.out.println(monsters.size());
    monsters.put("werewolf", new Monster("Jacob", false, 16));

    System.out.println(monsters.size());
    System.out.println(monsters.get("werewolf"));
  }
}