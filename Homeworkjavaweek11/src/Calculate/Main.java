package Calculate;
import org.checkerframework.checker.units.qual.C;
import java.util.Scanner;
public class Main {

    // following are Instance method for addition, Multiplication, substraction, division
    public void addition(int a, int b) {
        int result = a + b;
        System.out.println("Addition Result: " + result);
    }

    public void subtraction(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction Result: " + result);
    }

      public void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication Result: " + result);
    }

      public void division(int a, int b) {
        if (b != 0) {
            int result = a / b;
            System.out.println("Division Result: " + result);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }

    // Method to calculate result based on symbol
    public void calculateResult(int a, int b, char symbol) {
        switch (symbol) {
            case '+':
                addition(a, b);
                break;
            case '-':
                subtraction(a, b);
                break;
            case '*':
                multiplication(a, b);
                break;
            case '/':
                division(a, b);
                break;
            default:
                System.out.println("Invalid symbol. Please use '+', '-', '*', or '/'.");
        }
    }
}