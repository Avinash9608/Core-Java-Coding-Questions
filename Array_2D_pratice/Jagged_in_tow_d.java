package Array_2D_pratice;
import java.util.Scanner;
public class Jagged_in_tow_d {
    public static void main(String [] args)
    {
        Scanner kb=new Scanner(System.in);
        int [][] arr=new int [3][];
        arr[0]=new int[4];
        arr[1]=new int[5];
        arr[2]=new int[6];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println("Enter values of arr["+i+"]["+j+"]");
                arr[i][j]=kb.nextInt();
            }
        }
        int sum=0;
        System.out.println("Your entered arr is ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println(arr[i][j]);
                sum+=arr[i][j];
            }
        }
        System.out.println("Sum is "+sum);
    }
}
