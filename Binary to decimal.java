import java.util.Scanner;

public class BinaryToDecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();
l
        try {
            int decimal = binaryToDecimal(binaryString);
            System.out.println("The decimal equivalent of binary " + binaryString + " is: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number.");
        }

        scanner.close();
    }


    public static int binaryToDecimal(String binary) {
  
        if (!binary.matches("[01]+")) {
            throw new NumberFormatException("Not a valid binary number.");
        }


        int decimal = 0;
        int length = binary.length();
        
        for (int i = 0; i < length; i++) {
            char bit = binary.charAt(length - 1 - i);
            if (bit == '1') {
                decimal += Math.pow(2, i);
            }
        }

        return decimal;
    }
}
