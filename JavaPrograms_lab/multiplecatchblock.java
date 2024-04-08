package JavaPrograms_lab;

public class multiplecatchblock {
    public static void main(String[] args) {
        try {
            // Code that may throw exceptions
            int[] array = {1, 2, 3};
            int result = array[3]; // Out of bounds exception
            int quotient = 10 / 0; // Divide by zero exception
            String str = null;
            System.out.println(str.length()); // Null pointer exception
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle out of bounds exception
            System.out.println("Array index out of bounds!");
        } catch (ArithmeticException e) {
            // Handle divide by zero exception
            System.out.println("Cannot divide by zero!");
        } catch (NullPointerException e) {
            // Handle null pointer exception
            System.out.println("Null pointer exception occurred!");
        } catch (Exception e) {
            // Catch all other exceptions
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }
}