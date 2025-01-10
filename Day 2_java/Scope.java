public class Scope {
    
   
    public static void main(String[] args) {

        double length = 2;
        double width = 4;

        calculateArea(length, width);
        calculatePerimeter(length, width);

    }

    public static void calculateArea(double param1, double param2) {
        
        double area = param1 * param2;
        System.out.println("Area of the rectangle: " + area);
    }

    public static void calculatePerimeter(double param1, double param2) {
        
        double perimeter = 2 * (param1 + param2);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
