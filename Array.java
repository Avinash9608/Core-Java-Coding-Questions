import java.util.Scanner;
class Array
{
public static void main(String [] args)
{
Scanner kb=new Scanner(System.in);
int [] arr=new int[10];
for(int i=0;i<10;i++)
{
System.out.println("Enter elememnts in array");
arr[i]=kb.nextInt();
}
int sum=0;
for(int i=0;i<10;i++)
{
sum+=arr[i];
System.out.println("Sum of your array is "+sum);
System.out.println("Average of given sum is "+(float)sum/10);
}
}
}