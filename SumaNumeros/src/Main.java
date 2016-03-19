import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws NumberFormatException, Exception
	{
		int suma = 0;
		
	
		System.out.print("Quieres sumar un numero (s/n)? ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String resp = br.readLine();
		
		while(resp.equals("s"))
		
		{
		
		System.out.print("Esbribe un numero del 0 al 10: ");
		int num = Integer.parseInt(br.readLine());
		  
			suma += num;
			
		System.out.print("Quieres sumar uno mas?(s/n): ");
	    resp = br.readLine();
		
		}
		
		System.out.println("La suma total es: "+ suma);}}
			
	
	
	
	


		
		
		/*
		System.out.println("Hello World!");

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		double number1 = input.nextDouble();

		System.out.print("Enter second number: ");
		double number2 = input.nextDouble();

		double product = number1 * number2;
		System.out.printf("The product of both numbers is: %f", product);
	
		
		}
}*/
