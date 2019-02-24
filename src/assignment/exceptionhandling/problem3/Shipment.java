package assignment.exceptionhandling.problem3;


public class Shipment {
 private int id;
 private String name;
 private Port arrivalport;
 private Port departureport;
 Shipment()
{
    
}
public Shipment(int id,String name,Port arrivalport,Port departureport)
{
	this.id=id;
	this.name=name;
	this.arrivalport=arrivalport;
	this.departureport=departureport;
}
public int getId()
{
	return this.id;
	
}
public void setId(int id)
{
	 this.id=id;
	
}
public String getName()
{
	return this.name;
	
}
public void setName(String name)
{
	 this.name=name;
	
}

 
  public Port getArrivalport()
{
	return this.arrivalport;
	
}
public void setArrivalport(Port arrivalport)
{
	 this.arrivalport=arrivalport;
	
}
  public Port getDepartureport()
{
	return this.departureport;
	
}
public void setDepartureport(Port departureport)
{
	 this.departureport=departureport;
	
}
}