package chain.login;

public class DbLogger extends Processor {

    public DbLogger(Processor processor) {
        super(processor);
    }

    @Override
    public void process(String type) {
        if (type.equals("db")) {
            System.out.println("Logging this to DB");
        } else {
            super.process(type);
        }
    }

}
