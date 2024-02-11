package PATTERNS;

public class Half_Pyramid1 {
    public static void main(String[] args) {
        for(int i=0 ;i<5 ; i++) {
            for (int j=0 ; j<=i ; j++ )  //rows completed then space comes and next row starts from the next space.
            {
               System.out.print("1");
            }
            System.out.println();
        }
    }
}
