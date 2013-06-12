
public class SimplePizzaFactory {

	public Pizza create(String pizzaName) {
		Pizza pizza = null;
		if (pizzaName.equals("Veggie")){
			pizza = new Veggie();
		}	
		else if(pizzaName.equals("Kebab")) {
			pizza = new KebabPizza();
		}
		return  pizza;
	}
}
