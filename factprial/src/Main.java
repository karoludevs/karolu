import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Vamos a calcular un factorial");

		Scanner input = new Scanner(System.in);

		System.out.print("Introduce un numero entero y positivo: ");
		int num = Integer.parseInt (input.nextLine());
		int fact = 1;
		
		while(num < 0)
		{ 
		System.out.println("\nnumero no valido. Ha de ser positivo.");
		System.out.print("Introduce un numero entero y positivo: ");
			num = Integer.parseInt (input.nextLine());
		}
			for ( int i = 1; i <= num; i++) {
				fact = fact * (i);
			}

		System.out.println("\nEl factorial del numero es: " +fact);
		/*double number2 = input.nextDouble();

		double product = num * number2;
		System.out.printf("The product of both numbers is: %f", product);
*/	}
}
