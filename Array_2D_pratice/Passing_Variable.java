package Array_2D_pratice;
class Passing
{
    public void increment(int i, int j)
    {
        i++;
        j++;
    }
}
public class Passing_Variable {
    public static void main(String[] args) {
        int i=10, j=11;
        System.out.println("Before increment "+i+" "+j);
        Passing p=new Passing();
        p.increment(i,j);
        System.out.println("After increment "+i+" "+j);
    }
}