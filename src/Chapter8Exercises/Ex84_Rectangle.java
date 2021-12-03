package Chapter8Exercises;

// Exercise 8.4: Rectangle class
public class Ex84_Rectangle {

    public double length = 1;
    public double width = 1;

    Ex84_Rectangle(double length, double width) {
        this.width = width;
        this.length = length;
    }

    public double calculatePerimeter() {
        double perimeter = 2 * length + 2 * width;
        return perimeter;
    }

    public double calculateArea() {
        double area = length * width;
        return area;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0.0 || length > 20.0) {
            throw new IllegalArgumentException("length must be 0.0-20.0");
        }

        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0.0 || width >= 20.0) {
            throw new IllegalArgumentException("width must be 0.0-20.0");
        }

        this.width = width;
    }

}

// Class to test Rectangle class
class RectangleTest {

    public static void main(String[] args) {

        try {
            Ex84_Rectangle r1 = new Ex84_Rectangle(15, 12);

            System.out.printf("Area of r1: %.2f%n", r1.calculateArea());
            System.out.printf("Perimeter of r1: %.2f%n", r1.calculatePerimeter());

            System.out.println("After setting new length for r1: ");

            // set invalid value for length
            r1.setLength(30);

            System.out.printf("Area of r1: %.2f%n", r1.calculateArea());
            System.out.printf("Perimeter of r1: %.2f%n", r1.calculatePerimeter());

        } catch (IllegalArgumentException e) {
            System.out.printf("Exception: %s%n", e.getMessage());

        }

    }
}
