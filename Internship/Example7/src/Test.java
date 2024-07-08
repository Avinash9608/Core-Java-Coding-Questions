public class Test {
    private static int k;
    static
    {
        System.out.println("Static bloc initiaztaion k="+k);
        k=10;
    }

    public static void main(String[] args) {
        new Test();
    }
}
