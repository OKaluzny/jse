package box;

public class MaxBox {

    public static void main(String[] args) {

        Box exampleOne = new Box();
        Box exampleTwo = new Box(1, 1, 1);
        Box exampleThree = new Box(50);

        exampleOne.printBox();
        exampleThree.printBox();

        exampleOne.height = 5;
        exampleOne.width = 5;
        exampleOne.depth = 5;

        exampleOne.printBox();

        exampleTwo.height = 10;
        exampleTwo.width = 10;
        exampleTwo.depth = 10;

        exampleTwo.printBox();

        double o;
        double t;

        o = exampleOne.height * exampleOne.width * exampleOne.depth;
        System.out.println("The volume of the first box is: " + o);
        t = exampleTwo.height * exampleTwo.width * exampleTwo.depth;
        System.out.println("The volume of the second box is: " + t);

        exampleOne.squareParallelepiped();
        System.out.println("The area of the first box: " + exampleOne.squareParallelepiped());
        exampleTwo.squareParallelepiped();
        System.out.println("The area of the second box: " + exampleTwo.squareParallelepiped());
    }
}
