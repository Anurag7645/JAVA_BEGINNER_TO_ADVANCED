package PATTERNS;

public class Half_Pyramid01 {
    public static void main(String[] args) {
        int a=1;
        for(int i=0 ;i<5 ; i++) {
            for (int j=0 ; j<=i ; j++ )  //rows completed then space comes and next row starts from the next space.
            {
               System.out.print(a);
               a=(a==0)?1:0;
            }
            System.out.println();
        }
    }
}
