import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercise2_23 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the driving distance: ");
		double drivingDistance = input.nextDouble();
		System.out.println("Enter the miles per gallon: ");
		double mpg = input.nextDouble();
		System.out.println("Enter the price per gallon: ");
		double ppg = input.nextDouble();
		double cost = ((drivingDistance/mpg)*ppg);
		DecimalFormat f = new DecimalFormat("##.00");
		System.out.println("The cost of driving is "+f.format(cost));
	}

}
