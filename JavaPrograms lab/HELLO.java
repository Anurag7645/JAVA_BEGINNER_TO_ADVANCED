import java.util.Scanner;
class Hello{
public static void main(String[] args) {

 Scanner sc=new Scanner(System.in);

System.out.print("Enter the number:");
int num=sc.nextInt();
if(num%2==0){

System.out.print(num+"is Even");
}else{
System.out.print(num+"is Odd");
}
}
}