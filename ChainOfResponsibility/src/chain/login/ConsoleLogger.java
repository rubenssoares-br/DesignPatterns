package chain.login;

public class ConsoleLogger extends Processor {

    public ConsoleLogger(Processor processor) {
        super(processor);
    }

    @Override
    public void process(String type) {
        if (type.equals("console")) {
            System.out.println("Logging this to console");
        } else {
            super.process(type);
        }
    }

}
