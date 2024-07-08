class Test
{
public static void main(String [] args)
{
int a=10;
int b=20;
int c=a+b;
System.out.println("Sum of "+a+" and "+b+" is "+c);
System.out.println("Sum of "+a+" and "+b+" is "+a+b);
System.out.println(Math.PI);
System.out.println(Math.pow(a,2));
int rad=5;
float ar,circ;
ar=3.14f*rad*rad;
circ=2*3.14f*rad;
System.out.println("Area of Circle is "+ar);
System.out.println();
System.out.println("Circumference of circle is "+circ);
System.out.println("Hello "+args[0]+" "+args[1]);
int arr[]={10,20,30};
//System.out.println(args[13]);  Array out of bound exception
System.out.println(args.length);
}
}