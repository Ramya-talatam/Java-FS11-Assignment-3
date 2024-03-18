
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
