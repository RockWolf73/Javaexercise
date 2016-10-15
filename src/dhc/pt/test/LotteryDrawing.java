package dhc.pt.test;
import java.util.*;

/*
 * This program draw particular numbers from numbers.
 * author:pan
 * date:2016.10.3
 */

public class LotteryDrawing
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many numbers do you want to draw?");
		int k = in.nextInt();
		
		System.out.print("What is the highest number you can drwa?");
		int n = in.nextInt();
		
		int[] numbers = new int[n];
		for (int i = 0;i < numbers.length;i++)
			numbers[i] = i + 1;
		
		int[] result = new int[k];
		for(int i = 0;i < result.length;i++)
		{
			int r = (int)(Math.random()*n);
			
			result[i] = numbers[r];
			
			numbers[r] = numbers[n-1];
			n--;
		}	
		
		Arrays.sort(result);
		System.out.println("The numbers are:");
		for(int r:result)
			System.out.println(r);
	}

}
