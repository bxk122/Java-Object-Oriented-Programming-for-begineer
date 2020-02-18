package OOPPractice;

public class Inheritance 
{
	public static String hogwarts = "Harry Porter!";
	public String Simplify(int a, int b, int c) 
	{
		int e = 9;
		return (a+b-c) + " Coolio "+ e;
		
	}
		
	public String toString() 
	{
		
		return("Simplify: " + Simplify(5,6,7));
	}
	
}

class InheritanceTest extends Inheritance 
{
	//super.Simplify();
	public String toString() 
	{
		return(super.toString() + " Cool");
	}
}
