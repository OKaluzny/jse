package geometry;

public class App {

    public static void main(String[] args) {

        Triangle in = new Triangle();
        in.print();
        System.out.println("The perimeter of the triangle = " + in.perimeter() + " cm");
        System.out.println("The Area of a triangle = " + in.square() + " cm");
    }
}
