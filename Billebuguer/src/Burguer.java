public class Burguer
{
	private String command;
	private double price;
	private double addedPrice = price;
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
		this.addedPrice = price;
		
	}
	
	public void addPrice(double add){
		this.addedPrice +=  add;
		
	}

	public double printPrice(){

		return this.addedPrice;
	}

	public void printBurguer(){

		System.out.println("a " + price + "$ sale" + "\n" + meat + " burguer" + "\nRolltype " + rollType);

	}
	
	public void addIngredient(String ingredient){
		
		this.command += "\n" + ingredient + "\n";
		
	}
	public String command(){
		//System.out.println(rollType + this.meat + lettuce + tomato + carrot + egg);
		return command;//rollType + "\n" + meat + "\n" + lettuce + "\n" + tomato + "\n" + carrot + "\n" + egg;
	}

	public void setLettuce()
	{
		addPrice(this.lettuce);
	}

	public double getLettuce()
	{
		return lettuce;
	}

	public void setTomato()
	{
		addPrice(this.tomato);

	}

	public double getTomato()
	{
		return tomato;
	}

	public void setCarrot()
	{
		addPrice(this.carrot);
	}

	public double getCarrot()
	{
		return carrot;
	}

	public void setEgg()
	{
		addPrice(this.egg);
	}

	public double getEgg()
	{
		return egg;
	}
}
