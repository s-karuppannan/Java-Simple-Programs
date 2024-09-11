import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer n to generate the first n Fibonacci numbers: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
        
            generateFibonacci(n);
        }

        scanner.close();
    }
    public static void generateFibonacci(int n) {
        long first = 0, second = 1;

        System.out.print("The first " + n + " Fibonacci numbers are: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            long next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
