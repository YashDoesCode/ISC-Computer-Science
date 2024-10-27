import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter x1 coordinate:");
        int x1 = scanner.nextInt();
        System.out.println("Enter y1 coordinate:");
        int y1 = scanner.nextInt();
        
        System.out.println("Enter x2 coordinate:");
        int x2 = scanner.nextInt();
        System.out.println("Enter y2 coordinate:");
        int y2 = scanner.nextInt();
        System.out.println("Enter radius:");
        double radius = scanner.nextDouble();
        System.out.println("Enter area:");
        double area = scanner.nextDouble();
        
        Plane plane = new Plane(x1, y1);
        Circle object = new Circle(x1, y1, x2, y2, radius, area);
        
        object.Radius();
        object.findArea();
        
        System.out.println("\nPlane Coordinates:");
        plane.show();
        
        System.out.println("\nCircle Coordinates:");
        object.show();
        System.out.println("Radius of the circle: " + object.radius +"\nArea of the circle: " + object.area);
            }
}