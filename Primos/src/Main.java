import java.util.*;

public class Main
{
	static Boolean esPrimo( int a){
		boolean esprimo= true;
		int i = 2;
		while(i<a){
		if(a%i == 0)
			esprimo = false;
		i++;
		}
		return esprimo;
		
	}
	public static void main(String[] args)
	{
		System.out.println("Numeros Primos del 1 al 100");
		for ( int i =1; i <=100; i++){
			//boolean primo = esPrimo(i);
			if (esPrimo(i)){
			System.out.println(i);}
			
		}

	/*	Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		double number1 = input.nextDouble();

		System.out.print("Enter second number: ");
		double number2 = input.nextDouble();

		double product = number1 * number2;
		System.out.printf("The product of both numbers is: %f", product);
*/	}
}
