class StringLength
{
public static void main(String [] args)
{
String s1=new String("Bhopal");
int x;
x=s1.length();
System.out.println("String is "+s1);
//System.out.println("Char at index 1"+s1[1]); // error
char ch;
ch=s1.charAt(1);
System.out.println("char at index 1 "+ch);
System.out.println("Their length is "+x);
}
}