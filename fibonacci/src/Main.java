import java.util.*;

public class Main
{
	static int fibo( int a){
		int fibo = a;
		if (a>2){
		fibo= ((a-1)+(a-2));
		return fibo;
		}
		return fibo;
	}
	public static void main(String[] args)
	{
		System.out.println("Sucesion de Fibonacci");
		
		Scanner input = new Scanner(System.in);

		System.out.print("Introduce un numero positivo: ");
		int num = input.nextInt();
		System.out.println("El numero de fibonacci equivalente es: "+fibo(num));
		
		int fib1= 0;
		int fib2= 1;
		int fib3= 1;
		
		System.out.println("La sucesion hasta el numero: " +fibo(num) + "es: ");
		System.out.println(fib1);
		System.out.println(fib2);
		while (fib3<fibo(num)){
		 fib3= fib1 + fib2;
		 fib1= fib2;
		 fib2= fib3;
		 System.out.println(fib3);
		}
	/*	for (int i=0; i<=2; i++)
			System.out.println(fibo(i));
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		double number1 = input.nextDouble();

		System.out.print("Enter second number: ");
		double number2 = input.nextDouble();

		double product = number1 * number2;
		System.out.printf("The product of both numbers is: %f", product);
*/	}
}

