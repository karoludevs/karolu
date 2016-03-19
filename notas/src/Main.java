import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		System.out.print("Esbribe un numero del 0 al 10: ");
BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
		int nota = Integer.parseInt(num.readLine());
		
		switch (nota){
			case 1:
				System.out.println("\nSuspenso");
				break;
			case 2:
				System.out.println("\nSuspenso");
				break;
			case 3:
				System.out.println("\nSuspenso");
				break;
			case 4:
				System.out.println("\nSuspenso");
				break;
			case 5:
				System.out.println("\nAprovado");
				break;
			case 6:
				System.out.println("\nAprovado");
				break;
			case 7:
				System.out.println("\nNotable");
				break;
			case 8:
				System.out.println("\nNotable");
				break;
			case 9:
				System.out.println("\nExcelente");
				break;
			case 10:
				System.out.println("\nExcelente");
				break;
			default:
			    System.out.println("\nOlé!!");
		}
		/*
Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		double number1 = input.nextDouble();

		System.out.print("Enter second number: ");
		double number2 = input.nextDouble();

		double product = number1 * number2;
		System.out.printf("The product of both numbers is: %f", product);
	*/}
}
