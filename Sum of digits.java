import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int sum = calculateSumOfDigits(number);
        System.out.println("The sum of the digits of " + number + " is: " + sum);
        scanner.close();
    }

    public static int calculateSumOfDigits(int num) {
        int sum = 0;
        num = Math.abs(num);

        while (num > 0) {
            sum += num % 10; 
            num /= 10;
        }
        return sum;
    }
}
