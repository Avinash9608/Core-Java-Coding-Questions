package Array_2D_pratice;

public class Use_Static_Example {
    public static void main(String [] args ) {
        Static_example e = new Static_example(23, "Avinash ");
        Static_example f = new Static_example(23, "Anupam ");
        Static_example g = new Static_example(23, "Atul ");
        e.show();
        f.show();
        g.show();
        e.showNextId(); // output will be 4
        f.showNextId(); // output will be 4
        g.showNextId(); // output will be 4
        {
            Static_example x = new Static_example(23, "Shruti ");
            Static_example y = new Static_example(23, "Abhishek ");
            x.show();
            y.show();
            x.showNextId();
            y.showNextId();
        }
        e.showNextId(); // output will be 6 but correct is 4 because
    }
}
