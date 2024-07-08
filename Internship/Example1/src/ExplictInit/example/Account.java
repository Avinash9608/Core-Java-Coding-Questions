package ExplictInit.example;

public class Account {
    private int acc_id=101;
    private String name=new String("Deepak");
    private double balance=34560;
    public void show()
    {
        System.out.println("Account id "+acc_id);
        System.out.println("name "+name);
        System.out.println("balance "+balance);
    }
}
