import java.util.*;


	public class Main {

		public static void main(String[] args){

			Printer hp = new Printer(0, 50, true);
			hp.getTonerLevel();
			hp.getNumPagePrinted();
			hp.print(350);
			
			

		}
//	}
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
//	}
}
