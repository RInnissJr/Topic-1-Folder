import java.util.Scanner;
public class Exercise4_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string s1: ");
		String one = input.nextLine();
		System.out.println("Enter string s2: ");
		String two = input.nextLine();
		
		if(one.contains(two))
		{
			System.out.println(two+" is a substring of "+one);
			
		}
		else
		{
			System.out.println(two+" is a not substring of "+one);
		}
	}

}
