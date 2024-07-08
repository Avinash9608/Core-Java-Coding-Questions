package parametrizedcons;

public class UseAccount {
    public static void main(String[] args) {
        Account obj=new Account(101,"Avinah",3456);
        Account obj1=new Account(102,"Aniket",3006);
        Account obj2=new Account(103,"Animesh",6543);
        obj.show();
        obj1.show();
        obj2.show();
    }
}
