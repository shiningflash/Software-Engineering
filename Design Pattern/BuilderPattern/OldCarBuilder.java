package BuilderPattern;

public class OldCarBuilder implements CarBuilder {
	
	private Car car;
	
	public OldCarBuilder() {
		this.car = new Car();
	}

	@Override
	public void buildCarBody() {
		car.setCarBody("This is car body.");
	}

	@Override
	public void buildCarEngine() {
		car.setCarEngine("This is car engine.");
	}

	@Override
	public Car getCar() {
		return car;
	}

}
