import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Circle circ1 = new Circle(10.1);
    System.out.println(circ1.toString());
    Circle circ2 = new Circle(14);
    System.out.println(circ2.toString());
    Circle circ3 = new Circle(20.5);
    System.out.println(circ3.toString());

    Scanner userInput = new Scanner(System.in);
    System.out.println("type a number for length and width");
    double length = userInput.nextDouble();
    double width = userInput.nextDouble();
    Rectangle square = new Rectangle(length);
    System.out.println("square value " + square);
    Rectangle rec = new Rectangle (length, width);
    System.out.println("rectable value " + rec);

    double sideLength = userInput.nextDouble();
    Rectangle eqSquare = new Rectangle (sideLength);
    RegularPolygon triangle = new RegularPolygon (sideLength);
    System.out.println(triangle);
    System.out.println(eqSquare);
  }

}
