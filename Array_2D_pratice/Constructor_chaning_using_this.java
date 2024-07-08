package Array_2D_pratice;

public class Constructor_chaning_using_this {
    private int l,b,h;
    public Constructor_chaning_using_this(int l, int b, int h)
    {
        this.l=l;
        this.b=b;
        this.h=h;
    }
    public Constructor_chaning_using_this(int s)
    {
        this(s,s,s);
    }
    public Constructor_chaning_using_this(Constructor_chaning_using_this p)
    {
        this(p.l, p.b, p.h);
    }
    public void show()
    {
        System.out.println(" len= "+l+", breadth +"+b+", height ="+h);
    }
}
