package assignment.exceptionhandling.problem3;


public class Port {

    private int id;
	private String country;
	private String name;
	public Port()
	{
		
	}
	public Port(int id,String country,String name)
	{
		this.id=id;
		this.country=country;
		this.name=name;
	}
	public int getId()
	{
		return this.id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	public String getCountry()
	{
		return this.country;
	}
	public void setCountry(String country)
	{
		this.country=country;
	}
	 public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
}
