package JAVA_BEGINNER_TO_ADVANCED.PATTERNS;
import java.util.Scanner;
public class Inverted_Half_Pyramid {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = in.nextInt();
        for (int i = n ; i >= 1 ; i--) {
            for (int j = 1 ; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
