class exception{
public static void main(String [] args){
int a=10,b=0,c;
try{
c=a/b;
System.out.println("the value of c is"+c);
}
catch(ArithmeticException ae){
System.out.print("tre no is not devided by zero" +ae);
}
}
}