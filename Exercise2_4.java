import java.util.Scanner;

public class Exercise2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number in pounds:");
           double pound = input.nextDouble();
           double conversion = pound*0.454;
           double kilogram = conversion;
           
           System.out.println(pound+" pounds is "+ kilogram+" kilograms"); 
           
	}
}
