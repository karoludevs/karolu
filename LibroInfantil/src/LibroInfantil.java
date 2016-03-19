public class LibroInfantil extends Libro
{
	private int edadRecomendada = 18;

	public void setEdadRecomendada(int edadRecomendada)
	{
		this.edadRecomendada = edadRecomendada;
	}

	public int getEdadRecomendada()
	{
		return edadRecomendada;
	}
			
	public boolean esRecomendable(int edad)
	{
		if(edad < edadRecomendada)
		{
			/*boolean edad1= true;
			System.out.print("Edad recomendada <" + edadRecomendada);
			System.out.println("\nedad correcta");
			return edad1;*/
			return true;
		}else{
			/*boolean edad1 = false;
			System.out.print("Edad recomendada <" + edadRecomendada);
			System.out.println("\nedad incorrecta");
			return edad1;*/
			return false;
			  }
	}
}
