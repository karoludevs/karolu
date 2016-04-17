public class Account
{
	private int number;
	private int balance;
	private String customer;
	private String email;
	private int phone;
	
//	public Account(String customer, int number, int balance, String email, int phone){
//		
//		this.customer = customer;
//		this.number = number;
//		this.balance = balance;
//		this.email = email;
//		this.phone = phone;
//	}
	
	public void printAll(){
		System.out.println(" customer = " + customer +
					       "\n number = " + number + 
						   "\n balance = " + balance +
						   "\n email = " + email + 
						   "\n phone = " + phone);
	}

	public void setNumber(int number)
	{
		this.number = number;
	}

	public int getNumber()
	{
		return number;
	}

	public void setBalance(int balance)
	{
		this.balance = balance;
	}

	public int getBalance()
	{
		return balance;
	}
	
	public void depositBalance(int deposit){
		balance += deposit;
	}
	
	public void withdraw(int deposit){
		if(deposit < balance){
		balance -= deposit;
		}else{
			System.out.println("Not enought money, withdraw less amount plase.");
		}
	}

	public void setCustomer(String customer)
	{
		this.customer = customer;
	}

	public String getCustomer()
	{
		return customer;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getEmail()
	{
		return email;
	}

	public void setPhone(int phone)
	{
		this.phone = phone;
	}

	public int getPhone()
	{
		return phone;
	}
	
	
}
