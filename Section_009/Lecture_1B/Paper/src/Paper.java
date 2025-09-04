public class Paper {

  private double height;
  private double width;
  private boolean lined;
  private double weight;

  Paper(){
    this.height = 11.0;
    this.width = 8.5;
    this.lined = false;
    this.weight = 20.0;
  }
  Paper(double h, double w, boolean l, double we) {
    this.height = h;
    this.width = w;
    this.lined = l;
    this.weight = we;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public boolean isLined() {
    return lined;
  }

  public void setLined(boolean lined) {
    this.lined = lined;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void foldHeightInHalf() {
    this.height /= 2;
  }

  public void foldWidthInHalf() {
    this.width /= 2;
  }

  @Override
  public String toString(){
    return this.width + " x " + this.height + " " + this.weight + "lb " +
        ((this.lined) ? "lined" :"unlined") + " paper";
  }

  public static void main(String[] args) {
    Paper p1 = new Paper();
    Paper p2 = new Paper(36,24,false,100);

    System.out.println(p1);
    System.out.println(p2);

    System.out.println("folding p1 in half (reducing height) and p2 in half (reducing width");

    p1.foldHeightInHalf();
    p2.foldWidthInHalf();

    System.out.println(p1);
    System.out.println(p2);

  }
}