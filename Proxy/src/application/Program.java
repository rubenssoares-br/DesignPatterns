package application;


import entities.Internet;
import entities.ProxyInternet;

public class Program {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        internet.connectTo("tigrinho.com");
        internet.connectTo("google.com");
        internet.connectTo("bet365.com");

    }
}
