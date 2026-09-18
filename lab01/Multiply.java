import java.util.Scanner;

/**
 * CSCI 201 - Lab 1.
 *
 * @author Konnor Colson
 */

public class Multiply {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x;
    int y;
    // prompt user for an integer value x
    System.out.print("Enter an integer value for x: ");
    x = scanner.nextInt();
    System.out.print("Enter an integer value for y: ");
    y = scanner.nextInt();
    // make a call to multiply and report x and y
    System.out.println("x multiplied by y is: " + multiply(x, y));
    scanner.close();
  }

  public static int multiply(int num1, int num2){
    return num1 * num2;
  }
}