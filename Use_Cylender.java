class Circle
{
private int rad;
public Circle(int rad)
{
this.rad=rad;
}
public int getRadius()
{
return rad;
}
public double area()
{
return Math.PI*Math.pow(rad,2);
}
}

class Cylender extends Circle
{
private int height;
public Cylender(int rad, int height)
{
super(rad);
this.height=height;
}
public double area()
{
return 2*super.area() +2*Math.PI*getRadius()+height;
}
public double volumn()
{
return super.area()*height;
}
}


public class Use_Cylender
{
public static void main(String [] args)
{
Cylender b1=new Cylender(10,20);
System.out.println("Area of cylender is "+b1.area());
System.out.println("Voulmn of cylender is "+b1.volumn());
}
}