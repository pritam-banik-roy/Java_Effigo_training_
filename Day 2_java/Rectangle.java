public class Rectangle {
    
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        double length = 5.0; 
        double width = 3.0;  

        double area = calculateArea(length, width);
        System.out.println("The area of the rectangle is: " + area);
    }
}
