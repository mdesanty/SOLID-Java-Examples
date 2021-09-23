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

        for(IShape shape : shapes) {
            if(shape instanceOf Rectangle) {
                area += shape.getLength() * shape.getWidth();
            }
            else if(shape instanceOf Triangle) {
                area += 0.5 * shape.getBase() * shape.getHeight();
            }
            else {
                System.out.println("Unable to get area for :" + shape.getClass());
            }
        }

    }
}
