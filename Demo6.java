// parent // super // base 
class Pernt
{
	int money=5000000;
	 String car ="BMW";
	int site = 5;
	Pernt()
	{
		System.out.println("Money "+money);
		System.out.println("CAR  "+car);
	}
	
}
// child // sub // deriverd 
class Child extends Pernt
{
	int money=20000;		
	int site=2;
	Child()
	{
		System.out.println(" Child Money "+money);
		System.out.println(" Parent  Money "+super.money);
		System.out.println("SITE   "+(site+ super.site));	
		System.out.println("CAR  "+car);	
	}
}
public class Demo6
{
	public static void main(String args[])
	{
		Child c = new Child();
	}
}