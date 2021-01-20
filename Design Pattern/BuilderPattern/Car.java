package BuilderPattern;

public class Car implements CarPlan {
	
	private String body;
	private String engine;

	@Override
	public void setCarBody(String body) {
		this.body = body;
	}

	@Override
	public void setCarEngine(String engine) {
		this.engine = engine;
	}

	public String getCarBody() {
		return body;
	}
	
	public String getCarEngine() {
		return engine;
	}
}
