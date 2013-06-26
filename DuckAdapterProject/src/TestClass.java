
public class TestClass {
	public static void main(String[] args) {
		Duck realDuck = new MallardDuck();
		Turkey turkey = new  WildTurkey();
		Duck adapterDuck = new TurkeyClassAdapter(turkey);
		
		testDuck(realDuck);
		testDuck(adapterDuck);
	}
	
	public static void testDuck(Duck duck) {
		duck.fly();
		duck.quack();
	}

}
