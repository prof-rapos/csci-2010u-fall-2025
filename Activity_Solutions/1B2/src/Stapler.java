public class Stapler {

  private boolean electric;
  private final int CAPACITY;
  private int stapleCount;
  private String color;

  public Stapler(int CAPACITY, boolean electric, int stapleCount, String color) {
    this.CAPACITY = CAPACITY;
    this.electric = electric;
    this.stapleCount = stapleCount;
    this.color = color;
  }

  public boolean isElectric() {
    return electric;
  }

  public void setElectric(boolean electric) {
    this.electric = electric;
  }

  public int getCAPACITY() {
    return CAPACITY;
  }

  public int getStapleCount() {
    return stapleCount;
  }

  public void setStapleCount(int stapleCount) {
    this.stapleCount = stapleCount;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return "My" + (isElectric() ? " electric " : " analog ") + getColor() + " stapler can hold " + getCAPACITY()
      + " staples, but currently has " + getStapleCount();
  }

  public void addStaples(int numStaples) {
    if (stapleCount + numStaples <= getCAPACITY()) {
      setStapleCount(stapleCount + numStaples);
    } else {
      setStapleCount(CAPACITY);
    }
  }

  public void staple() {
    System.out.print("pushing down stapler: ");
    if (stapleCount > 0){
      System.out.println("*cah-chunk*");
      stapleCount--;
    } else {
      System.out.println("*click*");
    }

  }

  public static void main(String[] args) {
    Stapler swingline = new Stapler(250, false, 150, "red");
    System.out.println(swingline);
    System.out.println("Adding 50 staples;");
    swingline.addStaples(50);
    System.out.println(swingline);
    swingline.staple();
    System.out.println("Adding 50 staples;");
    swingline.addStaples(50);
    System.out.println(swingline);
    System.out.println("Removing all but 2 staples;");
    swingline.setStapleCount(2);
    swingline.staple();
    swingline.staple();
    swingline.staple();
    System.out.println("Darn, out of staples.");
  }
}