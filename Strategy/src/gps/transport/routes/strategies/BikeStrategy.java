package gps.transport.routes.strategies;

public class BikeStrategy implements RouteStrategy{
    @Override
    public void buildRoute(String origin, String destiny) {
        System.out.println("Calculating route for Bike...\n");
        System.out.println("Bike route calculated from: " + origin + " to " + destiny);
    }
}
