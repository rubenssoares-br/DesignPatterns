package entities;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
    private static final List<String> bannedSites;
    private final Internet internet = new RealInternet();

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("tigrinho.com");
        bannedSites.add("bet365.com");
    }


    @Override
    public void connectTo(String host) {
        boolean isBanned = bannedSites.contains(host);
        if (isBanned) {
            System.out.println("Access Denied!");
        } else {
            internet.connectTo(host);
        }
    }
}
