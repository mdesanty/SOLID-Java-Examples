import java.util.List;
import java.util.ArrayList;

public class AreaCalculator {
  private List<IShape> shapes;

  public AreaCalculator() {
    shapes = new ArrayList<IShape>();
  }

  public void addShape(IShape shape) {
    shapes.add(shape);
  }

  public float getTotalArea() {
    float area = 0;

    for(IShape shape : shapes)
      area += shape.getArea();

    return area;
  }
}
