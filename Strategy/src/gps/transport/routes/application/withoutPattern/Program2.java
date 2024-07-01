package gps.transport.routes.application.withoutPattern;

public class Program2 {
    public static void main(String[] args) {
        System.out.println("Starting GPS...");

        String transportChoice = getUserTransportChoice();
        String origin = getUserOrigin();
        String destiny = getUserDestination();

        if (transportChoice.equalsIgnoreCase("car")) {
            System.out.println("Calculating route for Car...\n");
            System.out.println("Car route calculated from: " + origin + " to " + destiny);
        } else if (transportChoice.equalsIgnoreCase("public transport")) {
            System.out.println("Calculating route for Public Transport...\n");
            System.out.println("Public Transport route calculated from: " + origin + " to " + destiny);
        } else if (transportChoice.equalsIgnoreCase("walk")) {
            System.out.println("Calculating route for Walking...\n");
            System.out.println("Walking route calculated from: " + origin + " to " + destiny);
        } else if (transportChoice.equalsIgnoreCase("bike")) {
            System.out.println("Calculating route for Bike...\n");
            System.out.println("Bike route calculated from: " + origin + " to " + destiny);
        } else {
            System.out.println("Invalid transport choice. Defaulting to walking.");
            System.out.println("Calculating route for Walking...\n");
            System.out.println("Walking route calculated from: " + origin + " to " + destiny);
        }
    }

    private static String getUserTransportChoice() {
        //Options: car, public transport, walk, bike
        return "carf";
    }

    private static String getUserOrigin() {
        return "Recife";
    }

    private static String getUserDestination() {
        return "Sao Paulo";
    }
}
