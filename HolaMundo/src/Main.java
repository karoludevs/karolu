import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		int pounds = 200;
		double poundToKilogram = 0.45359237d;
		
		System.out.println(pounds +" pounds son: "+ poundToKilogram * pounds +" kilograms");

		char uni = '\u00E6';
		System.out.println(uni);
		int mynum = 15;
		String myString = "500";
		
		myString = mynum + myString;
		System.out.println(myString);
		
		double num = 20d * 25d;
		double num2 = 80d * 25d;
		System.out.println("num = " +num +"\n"+ "num2 = " +num2);
		
		/*num = (num++) * 25d;
		num2 = 25d*(num2++);
		System.out.println("num = " +num +"\n"+ "num2 = " + num2);
		*/
		double totalReminder= (num+num2)%40;
		
		System.out.println(totalReminder);
		
		System.out.println('\u00AE');
		
		if (totalReminder >= 21){
			System.out.println("Total was over the limit");
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
