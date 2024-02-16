package JavaPrograms_lab;
import java.util.*;
public class ATM {
    
int acno;
String name;
double amount;
int withdr;
int dep;
atm(int acno,String name,double amount){
this.acno=acno;
this.name=name;
this.amount=amount;
}
void check_balance(){
System.out.println("Account No="+acno);
System.out.println("Name="+ name);
System.out.println("Balance="+ amount);
}
void withdraw(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter withdraw amount");
withdr=sc.nextInt();
if(withdr>0  && withdr<=amount){
System.out.println("Withdraw"+withdr);
amount=amount-withdr;
}
else{
System.out.println("Insufficient fund");
}
}
void deposit(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the amount u want to deposit");
dep=sc.nextInt();
amount=amount-withdr+dep;
}
}
class Test
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
atm obj = new atm(1111, "Shivanshu", 12000);
boolean b=true;
while(b)
{
System.out.println("Enter 1 for check balance 2 for deposit 3 for withdraw");
int ch=sc.nextInt();
if(ch>=3)
{
System.out.println("Invalid choice");
break;
}
else
{
switch(ch)
{
case 1:
obj.check_balance();
break;
case 2:
obj.deposit();
break;
case 3:
obj.withdraw();
break;
}
}
}
}
}  
}
