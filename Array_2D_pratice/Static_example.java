package Array_2D_pratice;

public class Static_example {
    private int age;
    private String name;
    private int id;
    private static int nextId=1;  // static data member
    public Static_example(int a, String n)
    {
        age=a;
        name=n;
        id=nextId++;
    }
    public void show()
    {
        System.out.println("id "+id+" age "+age+" name "+name);
    }
    public void showNextId()
    {
        System.out.println("Id of next employee will be "+nextId);
    }
}
