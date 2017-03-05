import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise4_2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double radius = 6371.01;
	       double distance = radius *
	       Math.acos( Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) +
	       Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) *
	       Math.cos(Math.toRadians(y1 - y2)));		
	       System.out.println("The distance between the two points is "+distance+" km");
	}
}
