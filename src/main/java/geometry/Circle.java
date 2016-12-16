package geometry;

public class Circle {

    private double radius;
    private Point center;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    // Returns the perimeter of the circle.
    public double perimeter() {
        return Math.PI * this.radius * 2;
    }

    // returns the area of a circle.
    public double square() {
        return Math.PI * this.radius * this.radius;
    }

    public void printCircle() {
        System.out.println("The circle with center " + this.center + " radius " + this.radius);
        System.out.println("the perimeter " + square());
        System.out.println("the area " + perimeter());
    }
}
