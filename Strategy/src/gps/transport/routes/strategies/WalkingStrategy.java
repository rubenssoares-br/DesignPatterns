package gps.transport.routes.strategies;

public class WalkingStrategy implements RouteStrategy{
    @Override
    public void buildRoute(String origin, String destiny) {
        System.out.println("Calculating route for Walking...\n");
        System.out.println("Walking route calculated from: " + origin + " to " + destiny);
    }
}
