public class Car
{
	private boolean engine;
	private String name;
	private int wheels;
	private int doors;

	public Car(boolean engine, String name, int wheels, int doors)
	{
		this.engine = engine;
		this.name = name;
		this.wheels = wheels;
		this.doors = doors;
	}

	public void setEngine(boolean engine)
	{
		this.engine = engine;
	}

	public boolean isEngine()
	{
		System.out.println("Engine is " + engine + ".");
		return engine;
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

	public void setDoors(int doors)
	{
		this.doors = doors;
	}

	public int getDoors()
	{
		return doors;
	}
	
	public boolean startEngine(boolean onOff){
		if (engine == false && onOff){
			System.out.println("The car is on now");
		}else if (engine && onOff){
			System.out.println("The car is already on");
		}else if((engine == false) && (onOff == false)){
			System.out.println("the car is already off");
		}else{
			System.out.println("The car is now off");
		}
		
		return onOff;
	}
	
	public int accelerate(int mxs){
		if (mxs > 0 && engine == true){
			System.out.println("You are accelerating " + mxs + "m/s.");
		}else {
			System.out.println("Car is off.");
		}
		return mxs;
	}
	
	public boolean brake(boolean yesNo){
		if (yesNo){
		System.out.println("The car is reducing velocity");
		}
		return yesNo;
	}
}
