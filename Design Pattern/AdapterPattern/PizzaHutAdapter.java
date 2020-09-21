package AdapterPattern;

public class PizzaHutAdapter implements PizzaInterface {
	
	PizzaHut pizzaHut;
	
	public PizzaHutAdapter(PizzaHut pizzaHut) {
		this.pizzaHut = pizzaHut;
	}

	@Override
	public void create() {
		
		pizzaHut.make();
		
	}

	@Override
	public void delivery() {
		
		pizzaHut.send();
		
	}
	
}
