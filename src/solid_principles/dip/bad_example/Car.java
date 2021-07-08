package solid_principles.dip.bad_example;

public class Car {

  private final Engine engine;
  private final Wheel wheel;

  public Car() {
    // tightly  coupled
    engine = new Engine();
    wheel = new Wheel();
  }
}
