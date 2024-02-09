import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Currency Converter");
        System.out.println("1. Convert from INR to USD");
        System.out.println("2. Convert from INR to EUR");

        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the amount in INR: ");
        double amountInINR = scanner.nextDouble();

        double convertedAmount = 0.0;

        switch (choice) {
            case 1:
                convertedAmount = convertINRtoUSD(amountInINR);
                System.out.println("Converted Amount: " + convertedAmount + " USD");
                break;
            case 2:
                convertedAmount = convertINRtoEUR(amountInINR);
                System.out.println("Converted Amount: " + convertedAmount + " EUR");
                break;
            default:
                System.out.println("Invalid choice! Please choose 1 or 2.");
        }
    }

    private static double convertINRtoUSD(double amountInINR) {
         
        return amountInINR * 0.83;
    }

    private static double convertINRtoEUR(double amountInINR) {
        
        return amountInINR * 0.90;
    }
}
 