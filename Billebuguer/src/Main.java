import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		String more = "y";
		while(more == "y"){
			System.out.println("Hello, welcome to BillBurguer." + 
							   "\nWhat type of roll do you prefer?" +
							   "\n1.Big \n2.Medium \n3.small");
			String type = input.nextLine();
			
			System.out.println("\nWould you like to add beaf or chicken ?:");

			String meat = input.nextLine();
			
			System.out.println("\nWould you like to add tomato?:");
			
			String tomato = input.nextLine();
			
			System.out.println("\nWould you like to add lettuce?:");

			String lettuce = input.nextLine();
			
			System.out.println("\nWould you like to add carrot&?:");

			String carrot = input.nextLine();
			
			
			System.out.println("\nWould you like to add egg?:");

			String egg = input.nextLine();
			
			Burguer hambu = new Burguer("medium", "chicken", 2);
			System.out.println(more);
			System.out.println("\nWould you like anything else?(y/n):");
			String more2 = input.next();
			System.out.println(more2);
			if(more2.equals("n")){
				break;}
		
		}
		//while(more == "y");
		
		
		}
}
