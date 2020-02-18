package OOPPractice;

//Also called an dynamic polymorphism.
//Method  override, same method returns different things
// This polymorphism is resolved during runtime based upon the calling method.
//Simplify method definition is different in every call
public class RunTimePolymorphism 
{
	public int Simplify(int a, int b) 
	{
		return a+b;
	}
}

class Test1 extends RunTimePolymorphism 
{
	public int Simplify(int a, int b) 
	{
		return Math.abs(a-b);
	}
}
class Test2 extends RunTimePolymorphism 
{
	public int Simplify(int a, int b) 
	{
		return (int) (a*b);
	}
}
