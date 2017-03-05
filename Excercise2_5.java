import java.util.Scanner;
public class Excercise2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the subtotal and gratuity rate.");
           double subtotal = input.nextDouble();
           double gratuityrate = input.nextDouble(); 
           double gr = gratuityrate/10; 
           double total = subtotal+gr;
           
           System.out.println("The gratuity is $"+ gr +" and total is $"+total);
           
	}

}
