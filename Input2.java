import Java.util.Scanner;
class Input2{
public static int add(int a,int b)
{
int c=a+b;
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
//5+7=12
system.out.println("num1+"+"+num2+"="+add(num1,num2));
}//main()
}//Input1