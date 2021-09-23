public class Main {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        calculator.addShape(new Rectangle(2, 4));
        calculator.addShape(new Triangle(3, 4));

        System.out.println(calculator.getTotalArea());
    }
}
