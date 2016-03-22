import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		int num = 5;
		int finalNum = 20;
		int count = 0;
		
		while(num<finalNum)
		{
		if(listEvenNumber(num)){
		System.out.println("El numero " + num + " es par ");
		}
		
		if(listEvenNumber(num)){
			count++;
			}
		num++;	
		}
		System.out.println("Hay " + count + " pares.");
		
		
		
		
		
		
//		System.out.println("Hello World!");
//
//		Scanner input = new Scanner(System.in);
//
//		System.out.print("Enter a number: ");
//		double number1 = input.nextDouble();
//
//		System.out.print("Enter second number: ");
//		double number2 = input.nextDouble();
//
//		double product = number1 * number2;
//		System.out.printf("The product of both numbers is: %f", product);
	}
	
	public static boolean listEvenNumber(int num)
	{
		
			if (num % 2 == 0)
			{
				return true;
			}
			else
				{
				return false;
				 }
			
		
		
	}
}

