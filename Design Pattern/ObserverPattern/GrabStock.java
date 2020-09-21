package ObserverPattern;

public class GrabStock {
	
	public static void main(String[] args) {
		
		StockGrabber stockGrabber = new StockGrabber();
		
		StockObserver observer1 = new StockObserver(stockGrabber);
		
		stockGrabber.setGooglePrice(120.5);
		stockGrabber.setFbPrice(110.0);
		stockGrabber.setMsPrice(127.9);
		
		stockGrabber.unRegister(observer1);
		
		StockObserver observer2 = new StockObserver(stockGrabber);
		
		stockGrabber.setGooglePrice(150.5);
		stockGrabber.setFbPrice(152.0);
		stockGrabber.setMsPrice(172.9);
		
	}

}
