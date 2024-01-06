package JAVA_BEGINNER_TO_ADVANCED.PATTERNS;
import java.util.Scanner;
public class Hollow_Rectangle {
    public static void  main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = in.nextInt();
        System.out.println("Enter the number of columns:");
        int m = in.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if((i==1||i==n||j==1||j==m)){
                System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
            }
            System.out.println();
        }           
    }
    
}
