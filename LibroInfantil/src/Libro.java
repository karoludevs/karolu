public class Libro
{
	protected String titulo;
	protected String isbn;
	protected boolean abierto = false;
	protected int numPaginas;
	protected int pagActual = 0;

	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}

	public String getTitulo()
	{
		return titulo;
	}

	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}

	public String getIsbn()
	{
		return isbn;
	}

	public void setAbierto(boolean abierto)
	{
		this.abierto = abierto;
	}

	public boolean isAbierto()
	{
		return abierto;
	}

	public void setNumPaginas(int numPaginas)
	{
		this.numPaginas = numPaginas;
	}

	public int getNumPaginas()
	{
		return numPaginas;
	}

	public void setPagActual(int pagActual)
	{
		this.pagActual = pagActual;
	}

	public int getPagActual()
	{
		return pagActual;
	}
	
	public void abrir(){
		
	}
	
	public void cerrar(){
		
	}
}
