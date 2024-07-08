class Student1
{
private int roll;
private char grade;
private double per;

public void setData()
{
roll=10;
grade='A';
per=78.9;
}
public void showData()
{
System.out.println("Roll ="+roll);
System.out.println("Grade ="+grade);
System.out.println("Per -"+per);
}
}
class UseStudent1
{
public static void main(String [] args)
{
Student1 S=new Student1();
S.setData();
S.showData();
}
}