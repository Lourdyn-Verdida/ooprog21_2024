public class TestCircle {
    public static void main(String[] args) {
        Circle a = new Circle();
        Circle b = new Circle();

        a.setRadius(3);
        System.out.println("First Circle:");
        System.out.println("Radius: " + a.getRadius());
        System.out.println("Diameter: " + a.getDiameter());
        System.out.println("Area: " + a.getArea());
        
        System.out.println();
        
        b.setRadius(20);
        System.out.println("Second Circle:");
        System.out.println("Radius: " + b.getRadius());
        System.out.println("Diameter: " + b.getDiameter());
        System.out.println("Area: " + b.getArea());
    }
}
public class Circle {
    static double radius;
    static double diameter;
    static double area;

      public static void setRadius(double rad) {
        radius = rad;
        diameter = 2 * radius;
        area = 3.14 * radius * radius;
    }
   
    public static double getRadius() {
        return radius;
    }

    public static double getDiameter() {
        return diameter;
    }

    public static double getArea() {
        return area;
    }
}
