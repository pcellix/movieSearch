import java.util.ArrayList;


public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList toppings = new ArrayList();
	
	
	public void prepare(){
		System.out.println("Preparing " + name);
		
	}
	
	public void bake(){
		System.out.println("Baking");
	}
	
	public String getName(){
		return name;
	}
}
