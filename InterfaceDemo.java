package OOPPractice;

interface DemoInterface1 
{
	public void height(double n);
	public String skin(String color);
	
}

interface DemoInterface2
{
	public void name(String name);
	public String language = "Nepalese";
	public default int add(int a, int b) 
	{
		return a+b;
	}
	
}

public class InterfaceDemo implements DemoInterface1, DemoInterface2
{
	double measure = 0;
	String FullName = "";
	public void height(double n) 
	{
		measure = n;
	}
	public String skin(String color) 
	{
		return color;
	}
	public void name(String name) 
	{
		FullName = name;
	}
	
	
}
