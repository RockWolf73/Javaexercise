package dhc.pt.test;
import java.util.*;

/*
 * This program tests the Employee class.
 * autor:pan
 * date:2016.10.5
 */

public class EmployeeTest
{
	public static void main(String[] args)
	{
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Carl",75000,1987,12,15);
		staff[1] = new Employee("Nike",50000,1989,10,1);
		staff[2] = new Employee("Tom",40000,1990,3,15);
		
		for (Employee e:staff)
			e.raiseSalary(5);
		
		for (Employee e:staff)
			System.out.println("name="+e.getName()+" salary="+e.getSalary()+",hireDay="
					+e.getHireDay());
	}

}

class Employee
{
	private String name;
	private double salary;
	private Date hireDay;
	
	public Employee(String n,double s,int year,int month,int day)
	{
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
		hireDay = calendar.getTime();
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public Date getHireDay()
	{
		return hireDay;
	}
	
	public void raiseSalary(double percent)
	{
		double raise = salary*percent/100;
		salary = salary + raise;
	}
}
