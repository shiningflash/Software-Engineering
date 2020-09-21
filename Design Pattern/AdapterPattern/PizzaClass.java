package AdapterPattern;

public class PizzaClass implements PizzaInterface {

	@Override
	public void create() {
		
		System.out.println("Create a pizza ...");
		
	}

	@Override
	public void delivery() {
		
		System.out.println("Deliver a pizza ...");
		
	}
	
}
