import java.util.Scanner;
class Emp
{
	int id;	
	String name;
	int age;
	int salary;
	String desig;
	Emp()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID");
		 id=sc.nextInt();
		System.out.print("Enter Name :");		
		 name=sc.next();
		System.out.println("Enter AGE");
		 age=sc.nextInt();	
	}
}
class Developer extends Emp
{

	Developer()
	{
	 	salary =70000;
	 	desig= "Developer";
	}
	void display()
	{	
		System.out.println("My ID is :"+id);
		System.out.println("My name is :"+name);
		System.out.println("My AGE is :"+age);
		System.out.println("My Salary is :"+salary);
		System.out.println("My Desig is :"+desig);
	}
}
class Clerk  extends  Emp
{
	
	int salary =70000;
	String desig= "Developer";
	void display()
	{	
		System.out.println("My ID is :"+id);
		System.out.println("My name is :"+name);
		System.out.println("My AGE is :"+age);
		System.out.println("My Salary is :"+salary);
		System.out.println("My Desig is :"+desig);
	}

}
class Manager extends  Emp
{
	
	int salary =50000;
	String desig= "Developer";
	void display()
	{	
		System.out.println("My ID is :"+id);
		System.out.println("My name is :"+name);
		System.out.println("My AGE is :"+age);
		System.out.println("My Salary is :"+salary);
		System.out.println("My Desig is :"+desig);
	}
}
class Tester extends  Emp
{
	
	int salary =50000;
	String desig= "Developer";
	void display()
	{	
		System.out.println("My ID is :"+id);
		System.out.println("My name is :"+name);
		System.out.println("My AGE is :"+age);
		System.out.println("My Salary is :"+salary);
		System.out.println("My Desig is :"+desig);
	}
} 
class Demo4
{
	public static void main(String args[])
	{
		int ch1=0;
		do
		{
			System.out.println("1 ) Developer ");
			System.out.println("2 ) Clerk  ");
			System.out.println("3 ) Manager ");
			System.out.println("4 ) Tester ");
			System.out.println("5 ) EXIT ");

			Scanner sc = new Scanner(System.in);
			System.out.print(" Enter the option ...! :");
			ch1=sc.nextInt();

			if(ch1==1)
			{
				Developer d = new Developer();
				d.display();
			}
			if(ch1==2)
			{
				Developer d = new Developer();
				d.display();
			}
			if(ch1==3)
			{
				Developer d = new Developer();
				d.display();
			}
			if(ch1==4)
			{
				Developer d = new Developer();
				d.display();
			}
			if(ch1==5)
			{
				System.out.println("Thank you ");
				System.exit(0);
			}
		}while(ch1!=5);
		
	}
}
