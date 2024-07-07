package chain.without.pattern;

public class ProgramW {
    public static void main(String[] args) {

        String logType = "console";

        if (logType.equals("db")) {
            System.out.println("Logging to database...");
        } else if (logType.equals("file")) {
            System.out.println("Logging to file...");
        } else if (logType.equals("console")) {
            System.out.println("Logging to console...");
        } else {
            System.out.println("Invalid logging type!");
        }
    }
}
