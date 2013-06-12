
public class ChocolateBoiler {
	public static ChocolateBoiler uniqueInstace;
	
	private boolean empty;
	private boolean full;
	
	private ChocolateBoiler() {
		empty = false;
	}
	
	public static ChocolateBoiler getInstance() {
		if(uniqueInstace == null){
			uniqueInstace = new ChocolateBoiler();
		}
		return uniqueInstace;
	}
	
	public void fill() {
		if (isEmpty()){
			empty = false;
		}			
	}
	
	public boolean isEmpty() { 
		return empty;
	}
}
