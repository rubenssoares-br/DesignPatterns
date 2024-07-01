package gps.transport.routes.strategies;

public class CarStrategy implements RouteStrategy{
    @Override
    public void buildRoute(String origin, String destiny) {
        System.out.println("Calculating route for Car...\n");
        System.out.println("Car route calculated from: " + origin + " to " + destiny);
    }
}
