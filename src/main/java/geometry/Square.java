package geometry;

public class Square {

	private Point a; // The top of the square.
	private Point b; // The top of the square.
	private Point c; // The top of the square.
	private Point d; // The top of the square.

	// default constructor that creates a circle with a user-specified parameters.
	public Square() {

		boolean error;
		do {

			System.out.println("Enter the apex A of the square ABCD: ");
			a = new Point();
			System.out.println("Enter the apex B of the square ABCD: ");
			b = new Point();
			System.out.println("Enter the apex C of the square ABCD: ");
			c = new Point();
			System.out.println("Enter the apex C of the square ABCD: ");
			d = new Point();

			if ((a.getX() - c.getX()) * (b.getY() - c.getY()) != (b.getX() - c
					.getX()) * (a.getY() - c.getY())) {
				error = false;
			} else {
				System.out.println("points lie on a straight line");
				error = true;
			}
		} while (error);
	}

	// Returns the perimeter of the square.
	public double getPerimeter() {
		return a.length(b) + b.length(c) + c.length(d) + d.length(a);
	}

	// returns the area of a square.
	public double getSquare() {
		return Math.pow(
				Math.sqrt(Math.pow(a.getX() - b.getX(), 2)
						+ Math.pow(a.getY() - b.getY(), 2)), 2);

	}

	// Displays a description of the triangle.
	public void print() {
		System.out.println("The coordinates of point A: " + a);
		System.out.println("The coordinates of point B: " + b);
		System.out.println("The coordinates of point C: " + c);
		System.out.println("The coordinates of point D: " + d);
	}
}
