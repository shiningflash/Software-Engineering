package ObserverPattern;

import java.util.ArrayList;

public class StockGrabber implements Subject {
	
	private ArrayList<Observer> observers;
	
	private double googlePrice;
	private double fbPrice;
	private double msPrice;
	
	public StockGrabber() {
		
		observers = new ArrayList<Observer>();
	
	}

	@Override
	public void register(Observer ob) {
		
		observers.add(ob);
	
	}

	@Override
	public void unRegister(Observer deleteOb) {
		
		int observerIdx = observers.indexOf(deleteOb);
		System.out.println("** Observer " + (observerIdx+1) + " deleted **");
		observers.remove(observerIdx);
	
	}

	@Override
	public void notifyObserver() {
		
		for (Observer observer : observers) {
			
			observer.update(googlePrice, fbPrice, msPrice);
			
		}
		
	}

	public void setGooglePrice(double googlePrice) {
		
		this.googlePrice = googlePrice;
		notifyObserver();
		
	}
	
	public void setFbPrice(double fbPrice) {
			
			this.fbPrice = fbPrice;
			notifyObserver();
			
		}
	
	public void setMsPrice(double msPrice) {
		
		this.msPrice = msPrice;
		notifyObserver();
		
	}
	
}
