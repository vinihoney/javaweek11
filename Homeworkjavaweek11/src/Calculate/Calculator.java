package Calculate;

import java.util.Scanner;

public class Calculator extends Main {
    public static void main(String[] args) {

        Main  calculator = new Main();
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the operation symbol (+, -, *, /): ");
        char operationSymbol = scanner.next().charAt(0);

        // Calculate and display result
        calculator.calculateResult(num1, num2, operationSymbol);

        // Close the scanner
        scanner.close();
    }

}
