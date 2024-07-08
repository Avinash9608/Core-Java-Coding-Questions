package ObjectInit.example;

public class Account {
    private int acc_id;
    private String name;
    private double balance;

    public Account()
    {
        acc_id=101;name=new String("Avinash");
        balance=5500;
    }
    public void show()
    {
        System.out.println("Account id "+acc_id);
        System.out.println("Name "+name);
        System.out.println("Balance "+balance);
    }
}
