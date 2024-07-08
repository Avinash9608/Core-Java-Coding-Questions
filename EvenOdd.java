class EvenOdd
{
public static void main(String [] args)
{
int a;
a=Integer.parseInt(args[0]);
String str=(a%2==0) ? "Even Number" : "Odd Number";
System.out.println((a%2==0) ? "Even Number" : "Odd Number");
}
}