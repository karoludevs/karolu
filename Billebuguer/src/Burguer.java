public class Burguer
{
	private String command;
	private double price;
	private String rollType;
	private String meat;
	private double lettuce = 0.25;
	private double tomato = 0.40;
	private double carrot = 0.35;
	private double egg = 0.50;

	public Burguer(String rollType, String meat, double price)
	{
		this.rollType = rollType;
		this.meat = meat;
		this.price = price;
		
	}
	
	public void addPrice(){
		price += add;
		
	}
	
	public void addIngredient(String ingredient){
		
		command += ingredient;
		
	}
	public String command(){
		//System.out.println(rollType + this.meat + lettuce + tomato + carrot + egg);
		return rollType + "\n" + meat + "\n" + lettuce + "\n" + tomato + "\n" + carrot + "\n" + egg;
	}

	public void setLettuce(double lettuce)
	{
		this.lettuce = lettuce;
	}

	public double getLettuce()
	{
		return lettuce;
	}

	public void setTomato(double tomato)
	{
		this.tomato = tomato;
	}

	public double getTomato()
	{
		return tomato;
	}

	public void setCarrot(double carrot)
	{
		this.carrot = carrot;
	}

	public double getCarrot()
	{
		return carrot;
	}

	public void setEgg(double egg)
	{
		this.egg = egg;
	}

	public double getEgg()
	{
		return egg;
	}
}
