package AdapterPattern;

public class TestPizzaClass {
	
	public static void main(String[] args) {
		
		PizzaClass pizzaClass = new PizzaClass();
		
		System.out.println("== Pizza Class ==");
		pizzaClass.create();
		pizzaClass.delivery();
		
		PizzaHut pizzaHut = new PizzaHut();
		
		PizzaInterface pizza = new PizzaHutAdapter(pizzaHut);
		
		System.out.println("\n== Pizza Hut ==");
		pizza.create();
		pizza.delivery();
		
	}

}
