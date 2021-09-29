import java.util.List;
import java.util.ArrayList;

public class AreaCalculator {
  private List<Rectangle> rectangles;
  private List<Triangle> triangles;

  public AreaCalculator() {
    rectangles = new ArrayList<Rectangle>();
    triangles = new ArrayList<Triangle>();
  }

  public void addRectangle(Rectangle rectangle) {
    rectangles.add(rectangle);
  }

  public void addTriangle(Triangle triangle) {
    triangles.add(triangle);
  }

  public float getTotalArea() {
    float area = 0;

    for(Rectangle rectangle : rectangles)
      area += rectangle.getLength() * rectangle.getWidth();

    for(Triangle triangle : triangles)
      area += 0.5 * triangle.getBase() * triangle.getHeight();

    return area;
  }
}
