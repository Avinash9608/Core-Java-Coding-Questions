import java.util.Scanner;
class Char_String
{
public static void main(String [] args)
{
Scanner kb=new Scanner(System.in);
String str, sentance,s;
char ch;
System.out.println("Enter your sentance ");
sentance=kb.nextLine();
System.out.println("your string is "+sentance);

System.out.println("Enter your char ");
s=kb.next();
ch=s.charAt(0);
System.out.println("your string is "+ch);

System.out.println("Enter your string ");
str=kb.next();
System.out.println("your string is "+str);
}
}