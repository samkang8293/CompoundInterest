import java.util.Scanner;

public class CompoundInterest {
	public static void main (String args []) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Initial Principal Amount: ");
		double init_p = input.nextDouble();
		
		System.out.println("Enter the Interest Rate: ");
		double interest = input.nextDouble();
		
		System.out.println("Enter the Number of Years: ");
		double years = input.nextDouble();
		
		double i = 1;
		double compound = (1 + (interest/100));
		double new_compound = compound;
		
		while (i < years) {
			new_compound *= compound;
			i++;
		}
		
		double amount = init_p * new_compound;
		
		int year = (int) years;
		
		System.out.println("The Final Principal Amount after " + year + " years is $" + amount);
		
	}
}