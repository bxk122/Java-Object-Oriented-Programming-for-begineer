package OOPPractice;
//Method overloading: Same method can be varies with different no of parameters
//also called static Polymorphism
public class CompileTimePolymorphism 
{
	public int compileTime() 
	{
		return 0;
	}
	
	protected int compileTime(int x, int y) 
	{
		return x+y;
	}
	static double compileTime(double x, double y) 
	{
		return (x+y);
	}
	public void compileTime(int x, double y) 
	{
		System.out.println("You are not cool!!: " + (x+y) + '\n');
	}
}
