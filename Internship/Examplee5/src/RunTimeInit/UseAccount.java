package RunTimeInit;
import java.util.Scanner;
public class UseAccount {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int id;
        String str;
        double amt;
        Account []act=new Account[3];
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter id, name and balance");
            id=kb.nextInt();
            str= kb.next();
            amt=kb.nextDouble();
            act[i]=new Account(id,str,amt);
        }
        for(int i=0;i<3;i++)
            act[i].show();
    }
}
