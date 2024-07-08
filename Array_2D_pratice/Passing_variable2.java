package Array_2D_pratice;
class Passing2
{
    private int a, b;
    public void setData(int i, int j)
    {
        a=i;
        b=j;
    }
    public void increment(Passing2 p)
    {
        p.a++;
        p.b++;
    }
    public void show()
    {
        System.out.println("a= "+a+", b="+b);
    }
}
public class Passing_variable2 {
    public static void main(String [] args)
    {
        Passing2 D=new Passing2();
        D.setData(10,20);
        System.out.println("Before incrementing ");
        D.show();
        Passing2 temp=new Passing2();
        temp.increment(D);
        System.out.println("After incrementing ");
        D.show();
    }
}
