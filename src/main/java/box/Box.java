package box;

public class Box {

	double width;
	double height;
	double depth;

	public Box() {

		height = 100;
		width = 100;
		depth = 100;
	}

	public Box(double height, double width, double depth) {

		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	public Box(int len){
		this.height = this.width = this.depth = len;
	}

	public void printBox() {

		System.out.println("��������� ��������������� - ������: " + width
				+ " ������: " + height + " �������: " + depth);
	}

	public double squareParallelepiped() {
		
		return 2 * ((height * width) + (width * depth) + (depth * height));
	}
}
