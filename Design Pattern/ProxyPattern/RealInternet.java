package ProxyPattern;

public class RealInternet implements Internet {

    @Override
    public void connectTo(String hostServer) throws Exception {
        System.out.println("Connecting to " + hostServer);
    }
}
