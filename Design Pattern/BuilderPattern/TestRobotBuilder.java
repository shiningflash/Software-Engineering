package BuilderPattern;

public class TestRobotBuilder {

	public static void main(String[] args) {
		
		CarBuilder oldStyleCar = new OldCarBuilder();
		
		CarEngineer carEngineer = new CarEngineer(oldStyleCar);
		
		carEngineer.makeCar();
		
		Car firstCar = carEngineer.getCar();
		
		System.out.println("Car Built");
		
		System.out.println("Car body: " + firstCar.getCarBody());
		System.out.println("Car engine: " + firstCar.getCarEngine());

	}

}
