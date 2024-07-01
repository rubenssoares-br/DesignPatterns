package gps.transport.routes.strategies;

public class PublicTransportStrategy implements RouteStrategy{
    @Override
    public void buildRoute(String origin, String destiny) {
        System.out.println("Calculating route for Public Transport...\n");
        System.out.println("Public Transport route calculated from: " + origin + " to " + destiny);
    }
}
