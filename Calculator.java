import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner dylan = new Scanner(System.in);

    try {
      System.out.print("Enter a number: ");
      double num1 = dylan.nextDouble();

      System.out.print("Enter another number: ");
      double num2 = dylan.nextDouble();

      System.out.print("Enter an operator (+, -, *, /): ");
      char operator = dylan.next().charAt(0);

      double result;

      switch (operator) {
        case '+':
          result = num1 + num2;
          break;
        case '-':
          result = num1 - num2;
          break;
        case '*':
          result = num1 * num2;
          break;
        case '/':
          result = num1 / num2;
          break;
        default:
          System.out.println("Invalid operator");
          return;
      }

      System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    } finally {
      // Close dylan Scanner in the finally block to ensure it is always closed
      dylan.close();
    }
  }
}
