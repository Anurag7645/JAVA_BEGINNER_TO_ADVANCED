package PATTERNS;
public class Half_Pyramid01 {

    // Define the entry point for the application
    public static void main(String args) {
        // Initialize a variable 'a' with value 1
        int a = 1;
 
        // Execute a loop 5 times
        for (int i = 0; i < 5; i++) {
 
            // Execute an inner loop, where the number of iterations is determined by the current value of 'i'
            for (int j = 0; j <= i; j++) {
 
                // Print the current value of 'a'
                System.out.print(a);
 
                // Toggle the value of 'a' between 0 and 1
                a = (a == 0) ? 1 : 0;
            }
 
            // Move to the next line after printing the values in each row
            System.out.println();
        }
    }
 }
 