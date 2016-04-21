public class HondaEv extends Car{
	
	private String motorType;
	private int autonomy;

		public HondaEv( String motorType, int autonomy)
		{
			super("hybrid", 4, 4, 5, 210);
			this.motorType = motorType;
			this.autonomy = autonomy;
			System.out.println("El coche nuevo tiene un " + motorType + " y una autonomia de " + autonomy + "km/h.");
		}

		public void setMotorType(String motorType)
		{
			this.motorType = motorType;
		}

		public String getMotorType()
		{
			return motorType;
		}

		public void setAutonomy(int autonomy)
		{
			this.autonomy = autonomy;
		}

		public int getAutonomy()
		{
			return autonomy;
		}
	
	
	
	
}
