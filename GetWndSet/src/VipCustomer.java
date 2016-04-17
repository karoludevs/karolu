public class VipCustomer
{
	private String name = "pep";
	private double credLimit;
	private String email;
	
	public VipCustomer(){
		this("Default name", 5500, "Default email");
		
	}

	public VipCustomer(String name, int credLimit)
	{
		this(name, credLimit, "carl@hotmail.com");
	
	}

	public VipCustomer(String name, int credLimit, String email)
	{
	this.name = name;
	//	this.credLimit = credLimit;
	//	this.email = email;
		System.out.println(name + "\n" + credLimit+ "\n" + email);
	}
	
	
	

//	public VipCustomer(){
//		this("Default name", 1500, "default@hotmail.com");
//	}
//	
//	
//	public VipCustomer(String name, int credLimit, String email){
//		
//		email = "calos@hot.com";
//	}
//	
//	public VipCustomer(){
//		this.name = name1;
//		
//	}

	public void setName(String name)
	{
		this.name = name;
	} 
	
	public String getName(){
		
		return name;
		
	}

	

	public void setCredLimit(int credLimit)
	{
		this.credLimit = credLimit;
	}


	public void setEmail(String email)
	{
		this.email = email;
	}


	
}
