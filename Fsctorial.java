import java.util.Scanner;
class Fsctorial
{
public static void main(String [] args)
{
Scanner kb=new Scanner(System.in);
int n, fact;
System.out.println("Enter a number :");
n=kb.nextInt();
for(fact=1;n>1;n--)
{
fact=fact*n;
}
System.out.println(fact);
}
}