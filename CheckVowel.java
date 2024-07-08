class CheckVowel
{
public static void main(String [] args)
{
char ch;
ch=args[0].charAt(0);
switch(args[0].charAt(0))
{
case 'A' : case 'E' : case 'I' : case 'O' : case 'U' :
System.out.println("Vowel");
break;
default:
System.out.println("Not Vowel");
}
}
} 