package solid_principles.ocp.bad_example;

public class Main {

  public static void main(String[] args) {

    Circle circle = new Circle();
    circle.setRadius(5);

    ShapeService shapeService = new ShapeService();
    shapeService.drawShape(circle);
  }

}
