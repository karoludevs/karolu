import java.util.*;


	public class Main {

		public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
			
			Printer hp = new Printer(65, 35, true);
			hp.getTonerLevel();
			hp.getNumPagePrinted();
			System.out.println("Introduce un numero de paginas a imprimir: ");
			double numpag = teclado.nextDouble();
			hp.print(numpag);
			
			

		}
}
