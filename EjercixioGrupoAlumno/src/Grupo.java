public class Grupo
{
	
	private Alumno[] arrayAlum = null;
	
	public Grupo(){
		arrayAlum = new Alumno[5];
		
		for (int i = 0; i < 5; i++){
			arrayAlum[i] = new Alumno();
		}
	}
	
	
	
}
