
public class PizzaTestDrive {
	public static void main(String[] args){
		PizzaStore nyPizza = new NyPizzaStore();
		PizzaStore chicagoPizza = new ChicagoPizzaStore();
		nyPizza.orderPizza("veggie");
		chicagoPizza.orderPizza("cheese");
	}
}
