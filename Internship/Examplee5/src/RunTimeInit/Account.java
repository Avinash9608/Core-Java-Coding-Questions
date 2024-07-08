package RunTimeInit;

public class Account {
    private int acc_id;
    private String name;
    private double balance;

    public Account(int id, String str, double amt)
    {
        acc_id=id;
        name=str;
        balance=amt;
    }
    public void show()
    {
        System.out.println("Account id "+acc_id);
        System.out.println("name "+name);
        System.out.println("Balance "+balance);
    }
}
