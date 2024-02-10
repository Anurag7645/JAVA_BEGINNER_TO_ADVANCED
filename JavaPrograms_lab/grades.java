import java.util.Scanner;
class grades
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int sum=0;
int arr;
for(int i=0;i<5;i++)
{
System.out.println("Enter the marks");
arr=sc.nextInt();
if(arr>100)
{
System.out.println("Marks should be less than 100");
break;
}
sum+=arr;
}
System.out.println("Total Marks:"+sum);
if(sum>=400 && sum<=500)
{
System.out.println("grades:O");
}
}
}