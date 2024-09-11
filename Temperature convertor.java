import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        System.out.print("Convert to (C/F): ");
        char unit = sc.next().toUpperCase().charAt(0);
        if (unit == 'C') {
            double celsius = (temp - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + celsius);
        } else if (unit == 'F') {
            double fahrenheit = (temp * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else {
            System.out.println("Invalid unit");
        }
    }
}
