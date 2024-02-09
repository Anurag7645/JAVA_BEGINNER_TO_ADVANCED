import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        String numberString = Integer.toString(number);

       
        int[] digits = new int[numberString.length()];

        
        for (int i = 0; i < numberString.length(); i++) {
            digits[i] = Character.getNumericValue(numberString.charAt(i));
        }

        
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }

        System.out.println("The sum of the digits is: " + sum);
    }
}