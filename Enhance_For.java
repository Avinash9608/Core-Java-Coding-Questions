class Enhance_For
{
public static void main(String [] args)
{
int [] arr={10,20,30,40,50};
//for(long x: arr)
for(int x: arr)
//for(float x: arr)
//for(double x: arr)
//for(byte x: arr) // It will give : possible lossy conversion from int to byte
{
System.out.println(x);
}
}
}