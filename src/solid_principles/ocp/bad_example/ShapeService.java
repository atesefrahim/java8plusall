package solid_principles.ocp.bad_example;

public class ShapeService {

  // this using is bad example, because if any new additions you must modify the following
  public void drawShape(Object shape){

    if (shape instanceof Rectangle) {
      // do anything
    }
    else if(shape instanceof Circle) {
        // do anything
    }
    else if(shape instanceof Square) {
      // do anything
    }

  }

}
