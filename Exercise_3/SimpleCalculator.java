package Exercise_3;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Enter operation (+, -, *, /):");
            char operator = scanner.next().charAt(0);

            System.out.println("Enter second number:");
            double num2 = scanner.nextDouble();

            double result = 0.0;

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
                    if (num2 == 0) {
                        System.out.println("Error: division by zero!");
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Error: invalid operator!");
                    return;
            }

            System.out.println("Result: " + result);
        }
    }
}
