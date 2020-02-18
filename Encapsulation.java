package OOPPractice;

public class Encapsulation 
{
	private String name;
	private double height;
	private String location;
	private int weight;
	
	//setters
	public void setName(String name) 
	{
		this.name = name;
	}
	public void setHeight(double height) 
	{
		this.height = height;
	}
	public void setLocation(String location) 
	{
		this.location = location;
	}
	public void setWeight(int weight) 
	{
		this.weight = weight;
	}
	
	//getters
	public String getName() 
	{
		return name;
	}
	public double getHeight() 
	{
		return height;
	}
	public int getWeight() 
	{
		return weight;
	}
	public String getLocation() 
	{
		return location;
	}
	
}
