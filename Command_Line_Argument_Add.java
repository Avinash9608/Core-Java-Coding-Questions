class Command_Line_Argument_Add
{
public static void main(String [] args)
{
/*
System.out.println("First No is "+args[0]);
System.out.println("Second No is "+args[1]);
System.out.println("Their sum is "+(args[0] + args[1]));
*/
//incompatible types: String cannot be converted to int
/*
int a, b, c;
a=(int)args[0];
b=(int)args[1];
c=a+b;
System.out.println("First No is "+a);
System.out.println("Second no is "+b);
System.out.println("Their sum is "+c);
*/
int a, b, c;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
c=a+b;
System.out.println("First No is "+a);
System.out.println("Second no is "+b);
System.out.println("Their sum is "+c);
double d, e, f;
d=Double.parseDouble(args[0]);
e=Double.parseDouble(args[1]);
f=d+e;
System.out.println("First No is "+d);
System.out.println("Second no is "+e);
System.out.println("Their sum is "+f);
}
}
