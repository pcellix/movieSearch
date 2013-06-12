
public class ChicagoPizzaStore extends PizzaStore {
	
	public Pizza createPizza(String item){
		Pizza pizza;
		if(item.equals("veggie"))
			pizza = new ChicagoVeggiePizza();
		else if (item.equals("cheese"))
			pizza = new ChicagoCheesePizza();
		else 
			pizza = null;
		return pizza;
			
	}
}
