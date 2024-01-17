import java.util.Scanner;
class Emp
{
	byte a=127;
	short s=32766;	
	long i=9234567890L;
	float f= 10/3f;
	double d= 10/3d;
	int a=100;
	void display()
	{	
		System.out.println("Byte: "+a);
		System.out.println("Short  : "+s);
		System.out.println("INTs  : "+i);
		System.out.println("Float   : "+f);
		System.out.println("Double    : "+d);
	}
}
class Demo3
{
	public static void main(String args[])
	{
		Emp e = new Emp();
		e.display();
	}
}
//1 byte === > 8 bit -===> 2 pow 8 ==> 256 ====> 256 / 2 128 to 126 
// 2 bytes ---> 16 bit ----> 2 pow 16 ==> 65,536>65,536/ 2 ===> 32768 to 32768