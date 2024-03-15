
import java.util.Scanner;

interface Multiplier {
    // Method to multiply two numbers
    default int multiply(int a, int b) {
        return a * b;
    }

    // Method to multiply three numbers
    default int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // Method to multiply multiple numbers (more than 3)
    default int multiply(int... numbers) {
        int result = 1;
        for (int num : numbers) {
            result *= num;
        }
        return result;
    }
}

public class multiply_interface implements Multiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Use case 1: For more than 3 parameters
        System.out.println("(For more than 3 parameters)");
        System.out.println("Enter the numbers (Press * to stop):");
        int num;
        int[] numbers = new int[100]; // Assuming not more than 100 numbers
        int count = 0;
        while (scanner.hasNextInt()) {
            num = scanner.nextInt();
            if (num == -1) break; // Exit loop if * is entered
            numbers[count++] = num;
        }
        int result = new multiply_interface().multiply(numbers);
        System.out.println("Method for multiple numbers called - (Result) - " + result);

        // Use case 2: For 2 parameters
        System.out.println("(For 2 parameters)");
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();
        result = new multiply_interface().multiply(num1, num2);
        System.out.println("Method for two numbers called - (Result) - " + result);

        // Use case 3: For 3 parameters
        System.out.println("(For 3 parameters)");
        System.out.println("Enter the first number:");
        int num3 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int num4 = scanner.nextInt();
        System.out.println("Enter the third number:");
        int num5 = scanner.nextInt();
        result = new multiply_interface().multiply(num3, num4, num5);
        System.out.println("Method for three numbers called - (Result) - " + result);

        scanner.close();
    }
}
