import java.util.Arrays;
import java.util.Scanner;

public class ArraySorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element [" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
