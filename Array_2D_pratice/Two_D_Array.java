package Array_2D_pratice;
import java.util.Scanner;
public class Two_D_Array {
    public static void main(String [] args)
    {
        Scanner kb=new Scanner(System.in);
        int [][] arr;
        System.out.println("Enter rows and column ");
        int row=kb.nextInt();
        int column=kb.nextInt();
        arr=new int[row][column];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.println("Enter values for arr["+i+"]["+j+"]");
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.println("Here what you entered ");
        int sum=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.println(arr[i][j]+" ");
                sum+=arr[i][j];
            }
        }
        System.out.println("Sum is "+sum);
        System.out.println("Average is "+(float)sum/(row*column));
    }
}
