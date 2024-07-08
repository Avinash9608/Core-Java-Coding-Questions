package Array_2D_pratice;

public class Finalized_method {
    private int age;
    private int id;
    private String name;
    private static int nextId=1;
    public Finalized_method(int a, String n)
    {
        age=a;
        name=n;
        id=nextId++;
    }
    public void show()
    {
        System.out.println("Id "+id+" age "+age+" name "+name);
    }
    public static  void showNextId()
    {
        System.out.println("Next id of future employee is "+nextId);
    }
    protected void finalize()
    {
        --nextId;
    }
}
