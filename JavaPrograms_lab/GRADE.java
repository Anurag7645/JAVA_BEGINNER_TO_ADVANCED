import java.util.Scanner;
public class GRADE 
{
  public static void main(String args[])
 {
   int marks[]= new int[5];
   int total=0;
   char grade;
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Enter the no");
   for(int i=0;i<5;i++)
   {
   marks[i]=sc.nextInt();
   }
   for(int i=0;i<5;i++)
   {
	   total=total+marks[i];
   }
 if(total>=400&&total<=500)
 {
	 grade='O';
	 System.out.println("Grade:"+grade); 
 }
 else if(total>=300&&total<=399)
 {
	 grade='E';
	 System.out.println("Grade:"+grade);
 }
 else if(total>=250&&total<=299)
 {
	 grade='A';
	 System.out.println("Grade:"+grade);
 }
 else if(total>=200&&total<=249)
 {
	 grade='B';
	 System.out.println("Grade:"+grade);
 }
 else if(total>=0&&total<=199)
 {
	 grade='F';
	 System.out.println("Grade:"+grade);
 }
   
}
}