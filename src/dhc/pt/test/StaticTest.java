package dhc.pt.test;

/*
 * This program test static methods
 */

public class StaticTest
{
	public static void main(String[] args)
	{
		Employee1[] staff = new Employee1[3];
		
		staff[0] = new Employee1("Tom",40000);
		staff[1] = new Employee1("Mike",50000);
		staff[2] = new Employee1("Peter",60000);
		
		for ( Employee1 e:staff)
		{
			e.setId();
			System.out.println("name="+e.getName()+" Id="+e.getId()+" salary="+e.getSalary());
			
		}
		int n = Employee1.getNextId();
		System.out.println("Next id = "+n);
		
	}

}

class Employee1
{
	private static int nextId = 1;
	
	private String name;
	private double salary;
	private int id;
	
	public Employee1(String n,double s)
	{
		name = n;
		salary = s;
		id = 0;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId()
	{
		id = nextId;
		nextId++;
	}
	
	public static int getNextId()
	{
		return nextId;
	}
	
}