package solid_principles.ocp.good_example;

public class Cube extends Shape{

  private int side;

  @Override
  void draw() {
    System.out.println("drawing cube");
  }

  public int getSide() {
    return side;
  }

  public void setSide(int side) {
    this.side = side;
  }
}
