public class Main {
  public static void main(String[] args) {
    AreaCalculator calculator = new AreaCalculator();

    calculator.addRectangle(new Rectangle(2, 4)); // Area: 8
    calculator.addRectangle(new Rectangle(2, 3)); // Area: 6
    calculator.addTriangle(new Triangle(3, 4)); // Area: 6
    calculator.addTriangle(new Triangle(2, 3)); // Area: 3

    System.out.println(calculator.getTotalArea());
  }
}
