import java.util.Scanner;
class element_in_array
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[]={4,3,2,5,1};
int flag=0;
System.out.println("Enter the element");
int a=sc.nextInt();
for(int i=0;i<arr.length;i++)
{
if(arr[i]==a)
{
flag=1;
break;
}
}
if(flag==1)
{
System.out.println("Found");
}
else
{
System.out.println("not");
}
}
}