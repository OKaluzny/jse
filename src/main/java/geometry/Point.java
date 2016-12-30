package geometry;

import java.util.Scanner;

public class Point {

    private double x = 0; // abscissa of the point.
    private double y = 0; // ordinate of the point.

    // The default constructor to create a point with the user-specified coordinates.
    public Point() {
        boolean error;
        do {
            error = false;
            System.out.println("Enter the point abscissa X: ");
            Scanner input = new Scanner(System.in);
            if (input.hasNextDouble()) {
                setX(input.nextDouble());
            } else {
                System.out.println("You entered is not a number, try again");
                error = true;
            }
        } while (error);
        do {
            error = false;
            System.out.println("Enter the point ordinate Y: ");
            Scanner input = new Scanner(System.in);
            if (input.hasNextDouble()) {
                setY(input.nextDouble());
            } else {
                System.out.println("You entered is not a number, try again");
                error = true;
            }
        } while (error);

    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    // Returns a string description.
    public String toString() {
        return "[x= " + getX() + "; y= " + getY() + "]";
    }

    // Displays a description of points.
    public void print() {
        System.out.print(this.toString());
    }

    // Method of calculating the distance between points.
    public double length(Point p) {
        return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
    }

    // Method checks whether the same point.
    public boolean equalsPoint(Point p) {
        if (this.x == p.x && this.y == p.y) {
            return true;
        } else {
            return false;
        }
    }

    // method that will display a message saying what is the point coordinate quarter.
    public void wherePointIs() {
        if (x > 0 && y > 0) {
            System.out.println("Point " + x + "; " + y
                    + " It lies in the I coordinate quarter.");
        } else if (x < 0 && y > 0) {
            System.out.println("Point " + x + "; " + y
                    + " It lies in the II coordinate quarter.");
        } else if (x < 0 && y < 0) {
            System.out.println("Point " + x + "; " + y
                    + " It lies in the III coordinate quarter.");
        } else if (x > 0 && y < 0) {
            System.out.println("Point " + x + "; " + y
                    + " It lies in the IV coordinate quarter.");
        } else if (x == 0 && y == 0) {
            System.out.println("Point " + x + "; " + y
                    + " It lies at the origin.");
        }
    }
}
