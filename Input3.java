import Java.util.Scanner;
class Input3{
public static int sub(int a,int b)
public static int mul(int a,int b)
public static int div(int a,int b)
{
int c=a-b;
int c=a*b;
int c=a%b;
return c;
}
public static void main(String args[])
{
scanner scob=new scanner(system.in);
system.out.println("Enter a number:");//5
int num1;
num1=scob.nextInt();
system.out.print("Enter a number:");//7
int num2;
num2=scob.nextInt();
//5-7=-2
//5*7=35
//5%7=0.71428
system.out.println("num1+"-"+num2+"="+sub(num1,num2));
system.out.println("num1+"*"+num2+"="+mul(num1,num2));
system.out.println("num1+"%"+num2+"="+div(num1,num2));
}//main()
}//input