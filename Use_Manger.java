class Emp
{
private String name;
private double sal;

public void setData(String name, double sal)
{
this.name=name;
this.sal=sal;
}
public String getName()
{
return name;
}
public double getSal()
{
return sal;
}
}

class Manager extends Emp
{
private double bonus;
public void setBonus(double bonus)
{
this.bonus=bonus;
}
public double getBonus()
{

return bonus;
}
public double getIncome()
{
double income;
income=getSal()+bonus;
return income;
}
}

public class Use_Manger
{
public static void main(String [] args)
{
Manager boss=new Manager();
boss.setData("Avinash", 345678.09);
boss.setBonus(200000.0);
System.out.println("Manager's name is "+boss.getName());
System.out.println("Mnager's income is "+boss.getIncome());
}
}