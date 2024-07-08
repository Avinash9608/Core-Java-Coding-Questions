package Array_2D_pratice;

public class Use_Constructor_chaning_using_this {
    public static void main(String [] args)
    {
        Constructor_chaning_using_this b1=new Constructor_chaning_using_this(10,20,30);
        Constructor_chaning_using_this b2=new Constructor_chaning_using_this(15);
        Constructor_chaning_using_this b3=new Constructor_chaning_using_this(b1);
        b1.show();
        b2.show();
        b3.show();
    }
}
