import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Car coche = new Car(false, "sport", 4, 5);
		
		
		coche.setEngine(true);
		coche.accelerate(25);
		coche.isEngine();
		coche.startEngine(false);
		}
}
