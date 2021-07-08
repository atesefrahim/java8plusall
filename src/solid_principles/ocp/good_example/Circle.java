package solid_principles.ocp.good_example;

public class Circle extends Shape{

  private int radius;

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  @Override
  void draw() {
    System.out.println("drawing circle");
  }
}
