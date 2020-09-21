package ObserverPattern;

public interface Subject {
	
	public void register(Observer ob);
	public void unRegister(Observer ob);
	public void notifyObserver();
	
}
