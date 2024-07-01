package gps.transport.routes.strategies;

public class Navigator {

    private RouteStrategy routeStrategy;

    public Navigator(String transportChoice) {

        switch (transportChoice.toLowerCase()) {
            case "car":
                routeStrategy = new CarStrategy();
                break;
            case "public transport":
                routeStrategy = new PublicTransportStrategy();
                break;
            case "walk":
                routeStrategy = new WalkingStrategy();
                break;
            case "bike":
                routeStrategy = new BikeStrategy();
                break;
            default:
                System.out.println("Invalid transport choice. Defaulting to walking.");
                routeStrategy = new WalkingStrategy();
        }
    }

    public void buildRoute(String origin, String destiny) {
        routeStrategy.buildRoute(origin, destiny);
    }
}
