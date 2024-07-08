package Array_2D_pratice;

public class Use_Finalized_method {
    public static  void main(String [] args )
    {
        Finalized_method.showNextId();
        {
            Finalized_method e=new Finalized_method(21,"Chandu ");
            Finalized_method f=new Finalized_method(22,"Anupam ");
            Finalized_method g=new Finalized_method(20,"Deepak ");
            e.show();
            f.show();
            g.show();
            Finalized_method.showNextId();
            {
                Finalized_method x=new Finalized_method(21,"Anushree ");
                Finalized_method y=new Finalized_method(21,"Ashfi ");
                Finalized_method z=new Finalized_method(21,"Zinda_Larki ");
                x.show();
                y.show();
                z.show();
                Finalized_method.showNextId();
                x=y=z=null;
                System.gc();
                System.runFinalization();
            }
            Finalized_method.showNextId();
            e=f=g=null;
            System.gc();
            System.runFinalization();

        }
        Finalized_method.showNextId();
    }
}
