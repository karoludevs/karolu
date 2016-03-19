import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Que hora es?");
		System.out.println("Introduce la hora numerica: ");
		
		Scanner input = new Scanner(System.in);
        int hora = input.nextInt();
		
		System.out.println("\nIntroduce los minutos: ");
		Scanner input1 = new Scanner(System.in);
        int min = input1.nextInt();
		
		if (hora<12 && hora>=0 && min > 0){
			System.out.println("\nBuenos dias!!, son las " +hora + ":" +min );
		}else if (hora > 12 && hora < 20){
			System.out.println("\nBuenas tardes!!, son las " + hora + ":" + min);
		}else if (hora > 20 && hora > 0){
			System.out.println("\nBuenas noches!!, son las " + hora + ":" + min);
		}else{
			System.out.println("\nHora en punto!");
		}
		
		}
}
