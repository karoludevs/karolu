import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		//double feets = 5;
		//double inches = 6;
		
		calcFeetAndInchesToCentimetres(6,5);
		calcFeetAndInchesToCentimetres(157);
		
		 
		 //System.out.println(calcFeetAndInchesToCentimetres(feets, inches));
		//System.out.println(feets + " feets and " + inches + " inches = " + (calcFeetAndInchesToCentimetres(5, 8) + " cm."));
	}
	 public static double calcFeetAndInchesToCentimetres(double feets, double inches){
		 if (feets < 0 || (inches > 12 || inches < 0)){
			 System.out.println("Invalid feets or inches parameters");
			 return -1;
			 
		 }else{
			 
			 double centimetres = (feets*12*2.54) + (inches*2.54);
			 System.out.println(feets + " feets and " + inches + " inches = " + centimetres + " cm.");
			 return centimetres;
			 
		 }
	 }
	public static double calcFeetAndInchesToCentimetres(double inches){
		if (inches >= 0){
			double feets= (int) (inches/12);
			double restinches = (int) inches % 12;
			System.out.println(inches + " inches = " + feets + " feets and " + restinches + " inches");
			return calcFeetAndInchesToCentimetres(feets, restinches);

		}else{
		//	System.out.println("Invalid feets or inches parameters");
			return -1;
			

		}
	}
}

