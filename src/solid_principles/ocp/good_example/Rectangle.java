package solid_principles.ocp.good_example;

public class Rectangle extends Shape {

  private int width;
  private int height;

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  @Override
  void draw() {
    System.out.println("draw rectangle");
  }
}
