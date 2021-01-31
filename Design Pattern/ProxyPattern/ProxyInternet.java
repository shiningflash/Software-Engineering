package ProxyPattern;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

    private Internet internet = new RealInternet();
    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<String>();
        bannedSites.add("abc.com");
        bannedSites.add("xyz.com");
    }

    @Override
    public void connectTo(String hostServer) throws Exception {
        if (bannedSites.contains(hostServer.toLowerCase())) {
            throw new Exception("Access Denied");
        }
        internet.connectTo(hostServer);
    }
}
