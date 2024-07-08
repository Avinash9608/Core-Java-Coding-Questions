import java.util.Scanner;
class Add_No_Up_To_User_Want
{
public static void main(String [] args)
{
String choice;
int c;
Scanner kb=new Scanner(System.in);
do
{
System.out.println("Enter 2 int :");
int a=kb.nextInt();
int b=kb.nextInt();
c=a+b;

System.out.println("Sum of their 2 int is :"+c);
System.out.println("Do you want to continue ?");
 choice=kb.nextLine();
}while(choice.equalsIgnoreCase("yes"));
}
}