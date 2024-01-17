import java.util.Scanner;
class Emp
{
	int id;	 //0
	String name;//null
	Emp()
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter ID");
		 //id=sc.nextInt();
		//System.out.print("Enter Name :");		
		 //name=sc.next();
	}
	void display()
	{	
		System.out.println("My ID is :"+id);
		System.out.println("My name is :"+name);
	}
}
class Demo2
{
	public static void main(String args[])
	{
		Emp e = new Emp();
		e.display();
	}
}