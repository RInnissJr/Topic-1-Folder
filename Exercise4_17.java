import java.util.Scanner;

public class Exercise4_17 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int one = input.nextInt();
		System.out.println("Enter a month: ");
		String two = input2.nextLine();
		
		if(two.contains("Jan"))
		{
			System.out.println(two+" "+one+" has 31 days.");
			
		}
		if(two.contains("Feb"))
		{
			System.out.println(two+" "+one+" has 29 days.");
			
		}
		if(two.contains("Apr"))
		{
			System.out.println(two+" "+one+" has 30 days.");
			
		}
		if(two.contains("May"))
		{
			System.out.println(two+" "+one+" has 31 days.");
			
		}
		if(two.contains("Jun"))
		{
			System.out.println(two+" "+one+" has 30 days.");
			
		}
		if(two.contains("Jul"))
		{
			System.out.println(two+" "+one+" has 31 days.");
			
		}
		if(two.contains("Aug"))
		{
			System.out.println(two+" "+one+" has 31 days.");
			
		}
		if(two.contains("Sep"))
		{
			System.out.println(two+" "+one+" has 30 days.");
			
		}
		if(two.contains("Oct"))
		{
			System.out.println(two+" "+one+" has 31 days.");
			
		}
		if(two.contains("Nov"))
		{
			System.out.println(two+" "+one+" has 30 days.");
			
		}
		if(two.contains("Dec"))
		{
			System.out.println(two+" "+one+" has 31 days.");
			
		}
	}

}
