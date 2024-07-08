class Inhances_For_Loop_C_L_A
{
public static void main(String [] args)
{
int sum=0;
int count=args.length;
if(count<2)
{
System.out.println("Please Enter atleast 2 elements ");
System.exit(0);
}
else
{
for(String x: args)
sum+=Integer.parseInt(x);
}
System.out.println("Sum is "+sum);
}
}