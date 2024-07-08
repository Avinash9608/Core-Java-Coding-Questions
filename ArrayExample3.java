class ArrayExample3
{
public static void main(String [] args)
{
int count=args.length;
if(count<2)
{
System.out.println("Please pass at lease 2 elements ");
System.exit(0);
}
else
{
int sum=0;
for(int i=0;i<count;i++)
{
sum+=Integer.parseInt(args[i]);
}
System.out.println("Sum is "+sum);
}
}
}
//Remove count by it's value that is arhs.length