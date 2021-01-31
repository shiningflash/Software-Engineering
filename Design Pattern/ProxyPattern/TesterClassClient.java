package ProxyPattern;

public class TesterClassClient {

    public static void main(String[] args) {

        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("www.amirulislam.zeet.app");
            internet.connectTo("www.xxyz.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
