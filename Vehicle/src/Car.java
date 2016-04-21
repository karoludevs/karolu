public class Car extends Vehicle{

		private String motor;
		private int doors;
		private int windows;
		private  int gears;
		private int speed;

		public Car (String motor, int doors, int windows, int gears, int speed)
		{
		 super("Honda", 4, 1);
			this.motor = motor;
			this.doors = doors;
			this.windows = windows;
			this.gears = gears;
			this.speed = speed;
			
			
		}
		
		public void velocity(int speed, String direction){
			move(speed, direction); 
		}

		public void setMotor(String motor)
		{
			this.motor = motor;
		}

		public String getMotor()
		{
			return motor;
		}

		public void setDoors(int doors)
		{
			this.doors = doors;
		}

		public int getDoors()
		{
			return doors;
		}

		public void setWindows(int windows)
		{
			this.windows = windows;
		}

		public int getWindows()
		{
			return windows;
		}

		public void setGears(int gears)
		{
			this.gears = gears;
		}

		public int getGears()
		{
			return gears;
		}
		
		

		public void setSpeed(int speed)
		{
			this.speed = speed;
		}

		public int getSpeed()
		{
			return speed;
		}
		
		
	
}
