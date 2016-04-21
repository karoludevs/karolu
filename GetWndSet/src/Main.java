import java.util.*;


public class Main
{
	public static void main(String[] args)
	{
		Account carlos = new Account();
		Account alba = new Account();
		VipCustomer vip = new VipCustomer();
		VipCustomer vip1 = new VipCustomer("carlos", 50000);
		VipCustomer vip2 = new VipCustomer("carlos", 50000, "ca@hot.com");
		//vip.setCredLimit(50000);
		
		
	System.out.println( vip.getName());

		
	
//		Scanner sentence = new Scanner(System.in);
//		
//		
//		
//		System.out.println("Welcome to Worldbank, please introduce your name account: ");
//	
//		String name = sentence.nextLine();
//		if(name.isEmpty()){
//			name = "carlos";}
//		System.out.println("\nSu email porfavor?: ");
//		String email = sentence.nextLine();
//			if (email.isEmpty()){
//				email = "car@hot.com";
//			}
//		System.out.println("\nSu telefono porfavor?: ");
//		Integer phone = sentence.nextInt();
//			if (phone == 0){
//				phone = 654456789;
//			}
//		System.out.println("\nQue desea? deposit o withdraw o salir (d/w/s)?:");
//		char opcion = sentence.next().charAt(0);
//		if (opcion == '0'){
//			opcion = 's';
//		}
//		
//		
//		if (name.equals("carlos")){
//		carlos.setCustomer(name);
//		carlos.setEmail(email);
//		carlos.setPhone(phone);
//		carlos.setNumber(1);
//			carlos.setBalance(5000);
//			if (opcion == 'd'){
//				System.out.println("\nCantidad: ");
//				int depo = sentence.nextInt();
//				carlos.depositBalance(depo);
//			}else if(opcion == 's'){
//				System.out.println("\nGracias por su visita");
//			}else if(opcion == 'w'){
//				System.out.println("\nCantidad: ");
//				int depo = sentence.nextInt();
//				carlos.withdraw(depo);
//			
//			}
//		System.out.println("\nSus datos son: ");
//		carlos.printAll();
//		
//		}else if(name.equals("alba")){
//		alba.setCustomer(name);
//		alba.setEmail(email);
//	    alba.setPhone(phone);
//		alba.setBalance(2000);
//			if (opcion == 'd'){
//				System.out.println("\nCantidad: ");
//				int depo = sentence.nextInt();
//				alba.depositBalance(depo);
//			}else if(opcion == 'w'){
//				System.out.println("\nCantidad: ");
//				int depo = sentence.nextInt();
//				alba.withdraw(depo);
//			}else if(opcion == 's'){
//				System.out.println("Gracias por su confianza");
//			}
//			}
//		System.out.println("\nSus datos son: ");
//		alba.printAll();
//		
//		
		
	}
}
