
import java.util.*;

public class Coche
{
	private List<Puerta> puertas = null;
	private List<Rueda> ruedas = null;
	private List<Motor> motores = null;
	
	public Coche(){
		puertas = new ArrayList();
		
		for (int i = 0; i < 5; i++){
			puertas.add(new Puerta());
			}
		
		ruedas = new LinkedList();
		
			for (int i = 0; i < 4; i++){
				ruedas.add(new Rueda());
		}
		
		motores = new LinkedList();

			motores.add(new Motor());
		
	}
}
