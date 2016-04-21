import java.util.*;


public class Main
{
	public static void main(String[] args)
	{
		Account carlos = new Account(1, 4000, "Default name", "Default email", 646468643);
		Account alba = new Account(1, 4000, "Default name", "Default email", 646468643);
		//VipCustomer vip = new VipCustomer();
		
		carlos.printAll();
		alba.printAll();
		
	
		Scanner sentence = new Scanner(System.in);
		
		
		
		/*System.out.println("Welcome to Worldbank, please introduce your name account: ");
		String name = sentence.nextLine();
		System.out.println("\nSu email porfavor?: ");
		String email = sentence.nextLine();
		System.out.println("\nSu telefono porfavor?: ");
		int phone = sentence.nextInt();
		System.out.println("\nQue desea? deposit o withdraw o salir (d/w/s)?:");
		String opcion = sentence.next();

		
		
		if (name.equals("carlos")){
		carlos.setCustomer(name);
		carlos.setEmail(email);
		carlos.setPhone(phone);
		carlos.setNumber(1);
			carlos.setBalance(5000);
			if (opcion.equals("d")){
				System.out.println("\nCantidad: ");
				int depo = sentence.nextInt();
				carlos.depositBalance(depo);
			}else if(opcion.equals("w")){
				System.out.println("\nCantidad: ");
				int depo = sentence.nextInt();
				carlos.withdraw(depo);
			}
		System.out.println("\nSus datos son: ");
		carlos.printAll();
		
		}else if(name.equals("alba")){
		alba.setCustomer(name);
		alba.setEmail(email);
	    alba.setPhone(phone);
		alba.setBalance(2000);
			if (opcion.equals("d")){
				System.out.println("\nCantidad: ");
				int depo = sentence.nextInt();
				alba.depositBalance(depo);
			}else if(opcion.equals("w")){
				System.out.println("\nCantidad: ");
				int depo = sentence.nextInt();
				alba.withdraw(depo);
			}
		System.out.println("\nSus datos son: ");
		alba.printAll();
		}else if(opcion.equals("s")){
			System.out.println("Gracias por su confianza");
		}
		*/
		
	}
}
