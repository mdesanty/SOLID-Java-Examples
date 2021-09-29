public class Main {
  public static void main(String[] args) {
    AreaCalculator calculator = new AreaCalculator();

    calculator.addShape(new Rectangle(2, 4)); // Area: 8
    calculator.addShape(new Rectangle(2, 3)); // Area: 6
    calculator.addShape(new Triangle(3, 4)); // Area: 6
    calculator.addShape(new Triangle(2, 3)); // Area: 3

    System.out.println(calculator.getTotalArea());
  }
}