package SingletonPattern;

public class SingletonTester {

	public static void main(String[] args) {
		
		// will create new one 
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton);
		
		// will return previous one
		System.out.println(Singleton.getInstance());
		
	}
	
}
