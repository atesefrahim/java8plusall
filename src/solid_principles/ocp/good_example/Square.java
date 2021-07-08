package solid_principles.ocp.good_example;

public class Square extends Shape {

  private int side;

  public int getSide() {
    return side;
  }

  public void setSide(int side) {
    this.side = side;
  }

  @Override
  void draw() {
    System.out.println("drawing Square");
  }
}
