import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);

		Burguer hambu = new Burguer("medium", "chicken", 2);
		String more = "y";
		while(more == "y"){
			System.out.println("Hello, welcome to BillBurguer.");
//			+ 
//							   "\nWhat type of roll do you prefer?" +
//							   "\n1.Big \n2.Medium \n3.small");
//			String type = input.nextLine();
//			
//			System.out.println("\nWould you like to add beaf or chicken ?:");
//
//			String meat = input.nextLine();
//			
			System.out.println("\nWould you like to add tomato?:");
			String tomato = input.nextLine();
			hambu.addPrice();
			hambu.addIngredient(tomato);
			
			System.out.println("\nWould you like to add lettuce?:");
			String lettuce = input.nextLine();
			hambu.setLettuce(lettuce);
			
			System.out.println("\nWould you like to add carrot&?:");
			String carrot = input.nextLine();
			hambu.setCarrot(carrot);
			
			
			System.out.println("\nWould you like to add egg?:");
			String egg = input.nextLine();
			hambu.setEgg(egg);
			
			
			System.out.println("\nWould you like anything else?(y/n):");
			String more2 = input.next();
			
			if(more2.equals("n")){
				System.out.println("Your command is:" + hambu.command());
				break;
				}
			
		}
		//while(more == "y");
		
		
		}
}
