import java.util.Scanner;
class Two_D_Array
{
public static void main(String [] args)
{
int [] [] arr;
int rs, cs;
Scanner kb=new Scanner(System.in);
System.out.println("Enter rows ");
rs=kb.nextInt();
System.out.println("Enter columns ");
cs=kb.nextInt();
arr=new int[rs][cs];
for(int i=0;i<rs;i++)
{
for(int j=0;j<cs;j++)
{
System.out.println("Enter value for arr ["+i+"]["+j+"]:");
arr[i][j]=kb.nextInt();
}
}
System.out.println("Here is what you enterd :");
int sum=0;
for(int i=0;i<rs;i++)
{
for(int j=0;j<cs;j++)
{
System.out.println(arr[i][j]+" ");
sum+=arr[i][j];
}
System.out.println();
}
System.out.println("Sum is :"+sum);
System.out.println("Average is :"+(float)sum/(rs*cs));
}
}
