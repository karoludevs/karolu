public class Vehicle
{
	private String name;
	private int wheels;
	private int frill;
	
	private int currentVelocity;
	private String currentDirection;
	

	public Vehicle(String name, int wheels, int frill)
	{
		this.name = name;
		this.wheels = wheels;
		this.frill = frill;
		
		
	}
	
	public void move(int velocity, String direction){
		this.currentVelocity = velocity;
		this.currentDirection = direction;
		System.out.println("the current velocity is " + currentVelocity + 
						   " km/h " + "and the direction is " + currentDirection);
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setWheels(int wheels)
	{
		this.wheels = wheels;
	}

	public int getWheels()
	{
		return wheels;
	}

	public void setFrill(int frill)
	{
		this.frill = frill;
	}

	public int getFrill()
	{
		return frill;
	}

	
	
}
