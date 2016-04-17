public class HondaEv
{
	public class HondaEv extends Car{
	
	private String motorType;
	private int autonomy;

		public HondaEv( String motorType, int autonomy)
		{
			
			this.motorType = motorType;
			this.autonomy = autonomy;
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
}
