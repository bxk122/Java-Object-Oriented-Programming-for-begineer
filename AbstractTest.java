package OOPPractice;

class AbstractTest1 extends Abstraction 
{
	int cool(int c, int d) 
	{
		return (d/c);
	}
	
	void hero() 
	{
		System.out.println("You think you are done???");
	}

}
class AbstractTest2 extends Abstraction 
{
	
	public int rectangle(int length, int breadth) 
	{
		return (length * breadth);
	}
	
	int cool(int c, int d) 
	{
		return (d*c);
	}
	
	void hero() 
	{
		System.out.println("No you are not done yet.");
	}

}
