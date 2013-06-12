public class NyPizzaStore extends PizzaStore {
	
	public Pizza createPizza(String item){
		Pizza pizza;
		if(item.equals("veggie"))
			pizza = new NyVeggiePizza();
		else if (item.equals("cheese"))
			pizza = new NyCheesePizza();
		else 
			pizza = null;
		return pizza;
			
	}
}
