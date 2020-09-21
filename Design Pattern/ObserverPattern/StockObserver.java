package ObserverPattern;

public class StockObserver implements Observer {
	
	private double googlePrice;
	private double fbPrice;
	private double msPrice;
	
	private static int observerIDTracker = 0;
	private int observerID;
	
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber) {
		
		this.stockGrabber = stockGrabber;
		this.observerID = ++observerIDTracker;
		stockGrabber.register(this);
		
	}

	@Override
	public void update(double googlePrice, double fbPrice, double msPrice) {
		
		this.googlePrice = googlePrice;
		this.fbPrice = fbPrice;
		this.msPrice = msPrice;
		
		printThePrices();
		
	}
	
	public void printThePrices() {
		
		System.out.println("\n" + observerID + 
				"\nGoogle Price : $" + googlePrice +
				"\nFacebook Price $: " + fbPrice +
				"\nMicrosoft Price $: " + msPrice + "\n");
	
	}
	
}
