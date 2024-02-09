import java.util.Scanner;

public class RightAngleTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the right-angled triangle: ");
        int numRows = scanner.nextInt();

        printRightAngleTriangle(numRows);
    }

    private static void printRightAngleTriangle(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            // Print asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to the next line for the next row
            System.out.println();
        }
    }
}
