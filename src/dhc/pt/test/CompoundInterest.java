package dhc.pt.test;

/*
 * This program shows how to store data in a 20 array
 * author:pan
 * date:2016.10.04
 */
public class CompoundInterest
{
	public static void main(String[] args)
	{
		final float STARTRATE=10;
		final int NRATES=6;
		final int NYEARS=10;
		
		double[] interestRate = new double[NRATES];
		for ( int j = 0; j < interestRate.length;j++)
			interestRate[j] = (STARTRATE+j)/100.0;
		
		double[][] balances = new double[NYEARS][NRATES];
		
		for (int j = 0;j < balances[0].length;j++)
			balances[0][j] = 10000;
		
		for (int i = 1; i < balances.length;i++)
		{
			for (int j = 0;j < balances[i].length;j++)
			{
				double oldBalances = balances[i-1][j];
				
				double interest = oldBalances * interestRate[j];
				
				balances[i][j] = oldBalances + interest;
			}
		}
		
		for (int j = 0;j < interestRate.length;j++)
			System.out.printf("%9.0f%%",100*interestRate[j]);
		
		System.out.println();
		
		for (double[] row:balances)
		{
			for (double b:row)
				System.out.printf("%10.2f",b);
			
			System.out.println();
		}
	}
}
