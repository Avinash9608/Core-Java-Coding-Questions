class Language 
{
public void greetings()
{ } }

class Hindi extends Language
{
public void greetings()
{
System.out.println("SHUBHPRABHAT");
}
}

class English extends Language
{
public void greetings()
{
System.out.println("Good Morning");
}
}

class French extends Language 
{
public void greetings()
{
System.out.println("Bon Jour!");
}
}


public class Use_Language
{
public static void main(String [] args)
{
Language lang;
lang=new Hindi();
lang.greetings();

lang=new English();
lang.greetings();

lang=new French();
lang.greetings();

}
}