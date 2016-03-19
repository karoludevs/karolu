import java.util.*;

public class Main
{
	public static void main(String[] args)
		
	{
		LibroInfantil li = new LibroInfantil();
		
		li.setEdadRecomendada(7);
	
		
		System.out.println("Introduce una edad");

		Scanner input = new Scanner(System.in);
		int	edadteclado = input.nextInt();
		 if(li.esRecomendable(edadteclado))
			 System.out.println("correcta");
		 else
			 System.out.println("error");
		 /*

		System.out.print("Enter a number: ");
		double number1 = input.nextDouble();

		System.out.print("Enter second number: ");
		double number2 = input.nextDouble();

		double product = number1 * number2;
		System.out.printf("The product of both numbers is: %f", product);
	*/}
}
