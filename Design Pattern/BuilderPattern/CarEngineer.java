package BuilderPattern;

public class CarEngineer {
	
	private CarBuilder carBuilder;
	
	public CarEngineer(CarBuilder carbuilder) {
		this.carBuilder = carbuilder;
	}

	public Car getCar() {
		return this.carBuilder.getCar();
	}
	
	public void makeCar() {
		this.carBuilder.buildCarBody();
		this.carBuilder.buildCarEngine();
	}

}
