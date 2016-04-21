import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Vehicle coche = new Vehicle("coche", 4, 1);
		Car honda = new Car("hybrid", 4, 6, 6, 210);
		HondaEv newCar = new HondaEv("hy3", 440);
		honda.velocity(230, "right");
		honda.setMotor("v5");
		newCar.setAutonomy(370);
		newCar.setMotorType("Electric motor");
		System.out.println(coche.getName());
		System.out.println(honda.getDoors());
		
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
}
