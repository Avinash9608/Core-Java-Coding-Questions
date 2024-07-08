package Array_2D_pratice;

public class Jagged_Array {
    public static void main(String [] args)
    {
        int [][] arr=new int[3][];
        arr[0]=new int[4];
        arr[1]=new int[5];
        arr[2]=new int[7];
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);
        System.out.println(arr[2].length);
    }
}
