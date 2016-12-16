package geometry;

public class Triangle {

	private Point a; // The top of the triangle.
	private Point b; // The top of the triangle.
	private Point c; // The top of the triangle.

	// default constructor that creates a circle with a user-specified
	// parameters.
	public Triangle() {

		boolean error;
		do {

			System.out.println("Enter the apex A of the triangle ABC: ");
			a = new Point();
			System.out.println("Enter the apex B of the triangle ABC: ");
			b = new Point();
			System.out.println("Enter the apex C of the triangle ABC: ");
			c = new Point();
			if ((a.getX() - c.getX()) * (b.getY() - c.getY()) != (b.getX() - c
					.getX()) * (a.getY() - c.getY())) {
				error = false;
			} else {
				System.out.println("points lie on a straight line");
				error = true;
			}
		} while (error);

	}

	// Returns the perimeter of the triangle.
	public double perimeter() {
		return a.length(b) + b.length(c) + c.length(a);
	}

	// returns the area of a triangle.
	public double square() {
		double ab = a.length(b);
		double bc = b.length(c);
		double ca = c.length(a);
		double p = this.perimeter() / 2;
		double h = (2 / ab)
				* Math.sqrt((p * (p - ab) * (p - bc) * (p - ca)) / 2);
		return ab * h / 2;
	}

	// Displays a description of the triangle.
	public void print() {
		System.out.println("The coordinates of point A: " + a);
		System.out.println("The coordinates of point B: " + b);
		System.out.println("The coordinates of point C: " + c);
	}

}
