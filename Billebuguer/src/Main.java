import java.util.*;

public class Main
{
	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);

		Burguer normal = new Burguer("medium", "chicken", 2);
        DeluxeBurguer deluxe = new DeluxeBurguer("normal chips", "cola");
		String more = "y";
		while(more.equals("y")){
			System.out.println("Hello, welcome to BillBurguer."
							   +
							   "\nWhat type of burguer do you prefer?" +
							   "\n1.Normal(n) \n2.Deluxe(d) ");
			String type = input.nextLine();
            if (type.equals("d")){
                System.out.println("\nWhat type of chips do you prefer?" +
								   "\n1.Normal(n) \n2.Deluxe(d) ");
                String chipsType = input.nextLine();

                System.out.println("\nWhat type of drink do you prefer?" +
								   "\n1.Water(w) \n2.Cola(c) ");
                String drinkType = input.nextLine();

            }
//			
//			System.out.println("\nWould you like to add beaf or chicken ?:");
//
//			String meat = input.nextLine();
//			
			System.out.println("\nWould you like to add tomato?:");
			String tomato = input.nextLine();
			if (tomato.equals("y")) {
				normal.setTomato();
				normal.addIngredient("tomato");
			}

			System.out.println("\nWould you like to add lettuce?:");
			String lettuce = input.nextLine();
			if (lettuce.equals("y")) {
				normal.setLettuce();
				normal.addIngredient("lettuce");
			}

			System.out.println("\nWould you like to add carrot&?:");
			String carrot = input.nextLine();
			if (carrot.equals("y")) {
				normal.setCarrot();
				normal.addIngredient("carrot");
			}

			System.out.println("\nWould you like to add egg?:");
			String egg = input.nextLine();
			if (egg.equals("y")) {
				normal.setEgg();
				normal.addIngredient("egg");
			}

			System.out.println("\nWould you like anything else?(y/n):");
			String more2 = input.next();

			if(more2.equals("n")){
				System.out.println("Your command is:" + "\n" + type + " burguer");
				normal.printBurguer();
				System.out.println("with " + normal.command()) ;
				System.out.println("\nTotal price: " + normal.printPrice());
				break;
			}

		}
		//while(more == "y");


	}
}
