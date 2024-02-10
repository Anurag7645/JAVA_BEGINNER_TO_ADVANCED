
public class PrintEvenNonPrimeNumbers {
    public static void main(String[] args) {
        int num = 2;  

        while (num <= 100)
           {  
            if (num % 2 == 0) {  
                boolean isPrime = true;

                
                for (int i = 3; i * i <= num; i += 2) {  
                    if (num % i == 0) {
                        isPrime = false;
                        break;  
                    }
                }

                if (!isPrime) {  
                    System.out.println(num);
                }
            }
            num += 2;  
        }
    }
}