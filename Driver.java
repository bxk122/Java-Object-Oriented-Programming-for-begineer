package OOPPractice;
public class Driver 
{
	public static void main(String[] args) 
	{
		//CompileTime Polymorphism
		System.out.println("CompileTime Polymorphism");
		CompileTimePolymorphism cTP = new CompileTimePolymorphism();
		System.out.println(cTP.compileTime());
		System.out.println(cTP.compileTime(5,6));
		System.out.println(CompileTimePolymorphism.compileTime(5.5,6.6));
		cTP.compileTime(5,6.6);
		
		//RuntTime POlymorphism
		System.out.println("RuntTime Polymorphism");
		RunTimePolymorphism rTP = new RunTimePolymorphism();
		System.out.println(rTP.Simplify(5,6));
		RunTimePolymorphism a = new Test1();
		System.out.println(a.Simplify(5,6));
		RunTimePolymorphism a1 = new Test2();
		System.out.println(a1.Simplify(5,5)+ '\n');
		
		//Abstraction
		System.out.println('\n'+"AbstractTest1");
		Abstraction aT1 = new AbstractTest1();
		System.out.println(aT1.cool(5, 6));
		aT1.hero();
		aT1.display();
		System.out.println(aT1.a);
		
		System.out.println('\n'+"AbstractTest2");
		Abstraction aT2 = new AbstractTest2();
		System.out.println(aT2.cool(5, 6));
		aT2.hero();
		aT2.display();
		AbstractTest2 aT3 = new AbstractTest2();
		System.out.println(aT3.rectangle(7,6));
		
		//Interface
		System.out.println('\n'+"Interface");
		InterfaceDemo iD = new InterfaceDemo();
		iD.name("Badal");
		iD.skin("brown");
		iD.height(5.8);
		System.out.println("Name: " + iD.FullName + "\nheight: "+ iD.measure + "\nSkin: " + iD.skin("brown")
		+ "\nLanguage: " + InterfaceDemo.language );
		System.out.println(iD.add(5,7));
		
		//Inheritance
		System.out.println('\n'+"Inheritance");
		Inheritance iH = new InheritanceTest();
		System.out.println(iH.toString() +'\n' + Inheritance.hogwarts);
		
		
		//Encapsulation
		System.out.println('\n'+"Encapsulation");
		Encapsulation eC = new Encapsulation();
		eC.setName("Badal Karki");
		eC.setHeight(5.11);
		eC.setLocation("Boston, MA");
		eC.setWeight(140);
		System.out.println("Name: " + eC.getName());
		System.out.println("Height: " + eC.getHeight());
		System.out.println("Weight: " + eC.getWeight());
		System.out.println("Location: " + eC.getLocation());
		
		
	}
}
