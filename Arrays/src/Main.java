import java.util.*;

public class Main{

private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Introduce 5 numeros: ");
		
		int[] numEnteros = getIntegers(5);
	}
		
		public static int[] getIntegers(int numInt)
		
		{
			int[] num = new int[numInt];
			for(int i=0; i<num.length; i++)
			{
			num[i] = scan.nextInt();
			}
			
			return num;
		}
	
			System.out.println("En la posicion " +  " esta el numero " + num[i]); 
			
		
	
	
}
