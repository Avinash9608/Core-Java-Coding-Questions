class Box
{
private int l, b, h;
public void setData(int l, int b , int h)
{
this.l=l;
this.b=b;
this.h=h;
show();
}
public void show()
{
System.out.println("L "+l+" , B "+b+" , H "+h);
}
}

public class Use_Box
{
public static void main(String [] args)
{
Box b1=new Box();
b1.setData(10,20,30);

}
}
