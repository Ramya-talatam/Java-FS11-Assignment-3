/*
Abstraction in Java is an oop concept that allows to represent the essential features of an object while hiding the implementation details.
It focuses on what an object does rather than how it achieves its behavior.

There are two main ways to implement abstraction in Java:
Abstract Classes:
An abstract class is a class that cannot be instantiated on its own and may contain abstract methods, which are methods without a body. 

Interfaces: 
An interface is a reference type in Java that contains only abstract methods, default methods, static methods, and constant declarations.
Interfaces cannot be instantiated directly, but classes can implement interfaces, thereby agreeing to provide concrete implementations for all the methods declared in the interface.

(Interfaces are more abstract than abstract classes as it does not allow to implement non abstract methods which means 100% abstraction)
*/
abstract class DataValley { 
	private String name; 

	public DataValley(String name) { this.name = name; } 

	public abstract void learn(); 

	public String getName() { return name; } 
} 

 
class FullStack extends DataValley { 
	public FullStack(String name) { super(name); } 

	public void learn() 
	{ 
		System.out.println(getName() + " learns FullStack Development course"); 
	} 
} 

class AI_ML extends DataValley { 
	public AI_ML(String name) { super(name); } 

	public void learn() 
	{ 
		System.out.println(getName() + " learns AI_ML course"); 
	} 
} 
 
public class Abstraction { 

	public static void main(String[] args) 
	{ 
		DataValley course1 = new FullStack("Ramya"); 
		DataValley course2 = new AI_ML("Sita"); 

		course1.learn(); 
		course2.learn(); 
	} 
}
