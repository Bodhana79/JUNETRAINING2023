public class ConcatExample3
{
  public static void main(String args[])
  {
    String str1="Hello";
    String str2="World";
    String str3="Java";
    String str4=Str1.concat("").concat(str2).concat("").concat(str3);
    System.out.println(Str4);
    String str5=str1.concat("!!!");
    System.out.println(str5);
    String str6=str1.concat("@").concat(str2);
    System.out.println(str6);   
}              
}