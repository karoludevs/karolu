import java.util.*;



class Car
{
	public boolean engine;
	private String name;
	private int wheels;
	private int doors;

	public Car(boolean engine, String name)
	{
		this.engine = engine;
		this.name = name;
		this.wheels = 4;
		this.doors = 5;
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

	public boolean startOffEngine(boolean onOff)
	{
		if (engine == false && onOff)
		{
			System.out.println("The car is on now");
		}
		else if (engine && onOff)
		{
			System.out.println("The car is already on");
		}
		else if ((engine == false) && (onOff == false))
		{
			System.out.println("the car is already off");
		}
		else
		{
			System.out.println("The car is now off");
		}

		return onOff;
	}

	public int accelerate(int mxs)
	{
		if (mxs > 0 && engine == true)
		{
			System.out.println("You are accelerating " + mxs + "m/s.");
		}
		else
		{
			System.out.println("Car is off.");
		}
		return mxs;
	}

	public boolean brake(boolean yesNo)
	{
		if (yesNo)
		{
			System.out.println("The car is reducing velocity");
		}
		return yesNo;
	}
}

	class Honda extends Car
	{
		private boolean electricMotor = true;
		private int motors = 2;

		public Honda(boolean electricMotor, int motors)
		{
			super(true, "Fire");
			this.electricMotor = electricMotor;
			this.motors = motors;
		}

		public boolean isElectricMotor()
		{
			return electricMotor;
		}

		public int getMotors()
		{
			return motors;
		}

	}
	

	class Opel extends Car
	{
		private boolean electricMotor = false;
		private int motors = 1;

		public Opel(boolean electricMotor, int motors)
		{
			super(true, "Corsa");
			this.electricMotor = electricMotor;
			this.motors = motors;
		}

		public boolean isElectricMotor()
		{
			return electricMotor;
		}

		public int getMotors()
		{
			return motors;
		}

	}
	

	class Toyota extends Car
	{
		private boolean electricMotor = false;
		private int motors = 2;

		public Toyota(boolean electricMotor, int motors)
		{
			super(true, "Prius");
			this.electricMotor = electricMotor;
			this.motors = motors;
		}
		
		public boolean isElectricMotor()
		{
			return electricMotor;
		}

		public int getMotors()
		{
			return motors;
		}
		

		public boolean startOffEngine(boolean onOff)
		{
			if (engine == false && onOff)
			{
				System.out.println("The car is on now");
			}
			else if (engine && onOff)
			{
				System.out.println("The car is already on");
			}
			else if ((engine == false) && (onOff == false))
			{
				System.out.println("the car is already off");
			}
			else
			{
				System.out.println("The car is now off");
			}

			return onOff;
		}
		@Override
		public int accelerate(int mxs)
		{
			if (mxs > 0 && engine == true)
			{
				System.out.println("You are accelerating " + mxs + "m/s.");
			}
			else
			{
				System.out.println("Car is off.");
			}
			return mxs;
		}
		@Override
		public boolean brake(boolean yesNo)
		{
			if (yesNo)
			{
				System.out.println("The car is reducing velocity");
			}
			return yesNo;
		}
		

	}
	
	public class Main
	{
		public  static void main(String[] args)
		{
			Car coche = new Car(false, "sport");
			coche.setEngine(true);
			coche.accelerate(25);
			coche.isEngine();
			coche.startOffEngine(true);
			
			Honda accord = new Honda(false, 1);
			accord.setEngine(true);
			accord.accelerate(25);
			accord.isEngine();
			accord.startOffEngine(true);
			
			Opel omega = new Opel(false, 1);
			omega.setEngine(true);
			omega.accelerate(25);
			omega.isEngine();
			omega.startOffEngine(true);
			
			Toyota scene = new Toyota(false, 2);
			scene.setEngine(true);
			scene.accelerate(25);
			scene.isEngine();
			scene.startOffEngine(true);
		}
	}
	

