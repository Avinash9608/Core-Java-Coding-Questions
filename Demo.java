class Parent
{
public void show(int i)
{
System.out.println("Show of the parent clss int "+i);
}
public void show(String n)
{
System.out.println("Show of the parent class string "+n);
}
}

class Child extends Parent
{
public void show(int i)
{
super.show(i);
System.out.println("Show of the child class int "+i);
}
public void show(double d)
{
System.out.println("Show of the child class double "+d);
}
}

public class Demo
{
public static void main(String [] args)
{
Child ch=new Child();
ch.show(2.5);
ch.show("Avinash");
ch.show(10);
}
}