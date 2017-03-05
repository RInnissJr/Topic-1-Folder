import java.util.Scanner; 
public class Exercise2_20 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter balance and interest rate ");
		
		double balance = input.nextDouble();
		double annualInterestRate = input.nextDouble();
		double interest = balance*(annualInterestRate/1200);
		
		System.out.println("The interest is: "+interest);	
	}

}
