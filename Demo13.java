class Car
{
	
	Car(int a )
	{
		System.out.println("CAr ");	
	}
}
class BMW extends Car
{
	BMW()
	{
		super(1100);
		System.out.println("BMW");
	}		
}
class Demo13
{
	public static void main(String args[])
	{
		
		BMW b = new BMW();	
	}
}