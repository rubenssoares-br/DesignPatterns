package gps.transport.routes.application;

import gps.transport.routes.strategies.Navigator;

public class Program {
    public static void main(String[] args) {
        System.out.println("Starting GPS...");

        String transportChoice = getUserTransportChoice();

        Navigator navigator = new Navigator(transportChoice);

        String origin = getUserOrigin();
        String destiny = getUserDestination();

        navigator.buildRoute(origin, destiny);
    }

    private static String getUserTransportChoice() {
        //Options: car, public transport, walk, bike
        return "bike";
    }

    private static String getUserOrigin() {
       return "Recife";
    }

    private static String getUserDestination() {
        return "Sao Paulo";
    }
}
