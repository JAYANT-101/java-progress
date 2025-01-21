import java.util.Scanner;

public class AreaCalculator {

    public static double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);  // Area of Circle
    }

    public static double calculateArea(double length, double breadth) {
        return length * breadth;  // Area of Rectangle
    }

    public static double calculateArea(float base, double height) {
        return 0.5 * base * height;  // Area of Triangle
    }
}

class AreaCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                System.out.println("Area of Circle: " + AreaCalculator.calculateArea(radius));
                break;
            case 2:
                System.out.print("Enter length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter breadth: ");
                double breadth = scanner.nextDouble();
                System.out.println("Area of Rectangle: " + AreaCalculator.calculateArea(length, breadth));
                break;
            case 3:
                System.out.print("Enter base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height: ");
                double height = scanner.nextDouble();
                System.out.println("Area of Triangle: " + AreaCalculator.calculateArea(base, height));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}