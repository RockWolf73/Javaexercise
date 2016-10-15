package dhc.pt.test;
import java.util.*;

/*
 * This program count retirement years.
 * author:pan
 * date:2016.10.2
 */
public class Retirement
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("How much money do you need to retire ?");
		double goal = in.nextDouble();
		
		System.out.print("How much money will you contribute every year?");
		double payment = in.nextDouble();
		
		System.out.print("Interes rate in %: ");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		int years = 0;
		
		while (balance < goal)
		{
			balance += payment;
			double interest = balance*interestRate/100;
			balance += interest;
			years++;
		}
		
		System.out.println("You can retire in " + years +"years.");
	}
	

}
