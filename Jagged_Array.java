import java.util.Scanner;
class Jagged_Array
{
public static void main(String [] args)
{
int [][] arr= new int[3][];
Scanner kb=new Scanner(System.in);
arr[0]=new int[4];
arr[1]=new int[5];
arr[2]=new int[3];
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr[i].length;j++)
{
System.out.println("Enter value of arr["+i+"]["+j+"]");
arr[i][j]=kb.nextInt();
}
}
System.out.println("Here your entered number are :");
int sum=0, count=0;
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr[i].length;j++)
{
System.out.println(arr[i][j]+" ");
sum+=arr[i][j];
++count;
}
System.out.println();
}
System.out.println("Sum is :"+sum);
System.out.println("Average is :"+(float)sum/count);
}
}
