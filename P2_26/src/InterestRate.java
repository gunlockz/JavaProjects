import java.util.Scanner;
/* This is the library for including inputs */

public class InterestRate {
	static Scanner in = new Scanner(System.in);
	// fire up input streams
	
	public static double CalculateFinal(double initialAmount, double interestRate, int timesPerYear, int numOfMonths) {
		double interestRateFixed = interestRate / 100.0;
		return initialAmount* Math.pow((1 + (interestRateFixed / timesPerYear)), (1/12.0) * timesPerYear);
	}
	
	public static void main(String[] args) {
		
		//read the balance
		System.out.print("Please enter the balance : ");
		double balance = in.nextDouble();
		
		//read the interest
		System.out.print("\nPlease enter the interest : ");
		double interest = in.nextDouble();
		
		System.out.printf("\nInitial balance: %.2f", balance);
		System.out.printf("\nAnnual interest rate: %.2f", balance);
		
		double[] balanceList = new double[3];
		for (int i = 0; i < balanceList.length; i++) {
//			balanceList[i] = CalculateFinal(balance, interest, 1, i + 1);
			if (i == 0)
				balanceList[i] = balance + balance*( (interest/12.0) * (1/100.0));
			else
				balanceList[i] = balanceList[i-1] + balanceList[i-1]*( (interest/12.0) * (1/100.0));
		}
		System.out.printf("\n %-20s %.2f", "After first month: ", balanceList[0]);
		System.out.printf("\n %-20s %.2f", "After second month: ", balanceList[1]);
		System.out.printf("\n %-20s %.2f", "After third month: ", balanceList[2]);
	}
}
