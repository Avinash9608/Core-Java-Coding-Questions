import java.util.Scanner;
class Salesman
{
public static void main(String [] args)
{
Scanner kb=new Scanner(System.in);
System.out.println("How Many Salesman ?:");
int salesman=kb.nextInt();
int value=0;
int [][] arr=new int[salesman][];
for(int i=0;i<salesman;i++)
{
System.out.println("How many sales for salesman "+(i+1));
value=kb.nextInt();
arr[i]=new int[value];
System.out.println(arr[i]);
}
int sum=0, count=0;
for(int i=0;i<salesman;i++)
{
for(int j=0;j<value;j++)
{
System.out.println("Enter "+value+" sales value ");
System.out.println("values of sale is arr["+salesman+"]["+value+"]");
arr[salesman][value]=kb.nextInt();
}
}
for(int i=0;i<salesman;i++)
{
for(int j=0;j<value;j++)
{
System.out.println(arr[salesman][value]+" ");
sum+=arr[salesman][value];
}
System.out.println();
}
System.out.println("Sum is :"+sum);
}
}