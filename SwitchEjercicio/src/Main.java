import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		
		char value = 'E';
		
		switch (value) {
			
			case 'A':
				System.out.println("Value is A.");
				break;
			
			case 'B':
				System.out.println("Value is B.");
				break;
				
			case 'C': case 'D': case'E':
				System.out.println("Value is " + value);
				break;
				
		
				
			default:
			    System.out.println("Value is not A,B,C,D or E.");
			
		}
		
		for (int i=8; i>=2; i--){
			System.out.println("El " + i +" % de interes sobre 10000 es de " + String.format("%.0f",calculateInterest(10000,i)));
		}
		
		int count = 0;
		int num2 = 40;
		for (int num = 1 ; num < (long) Math.sqrt(num2); num++){
			if (count < 20){
			if (isPrime(num) == true){
		System.out.println("numero primo " + num + " es: " + isPrime(num));
		count++;
		
		}
	}
}
 for (int i = 1; i <= 20; i++){
	 isEvenNumber(i);
 }
}
		
		
		public static double calculateInterest(int amount, double interestRate){
			
			double interest = (amount* (interestRate/100));
			
			return interest;
			
		}
	
		public static boolean isPrime(int number){
			if (number == 2){
				return true;
			}
			else if(number == 1 || number % 2 == 0){
			 return false;
			}else{
				
				return true;
			}
		}
		
		public static boolean isEvenNumber(int num){
			if (num % 2 == 0){
				System.out.println(num + " es par.");
					return true;
			}else{
				System.out.println(num + " no es par.");
				return false;
			}
		}
	}
	
//		
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
	
