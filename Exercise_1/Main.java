import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter number n: ");
            int n = scanner.nextInt();
            
            
            int triangleNumber = 0;
            for (int i = 1; i <= n; i++) {
                triangleNumber += i;
            }
            System.out.println("n-th triangular number: " + triangleNumber);
            
            
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("n! = " + factorial);
        }
    }
}