package chain.login;

public class FileLogger extends Processor {

    public FileLogger(Processor processor) {
        super(processor);
    }

    @Override
    public void process(String type) {
        if (type.equals("file")) {
            System.out.println("Logging this to file");
        } else {
            super.process(type);
        }
    }

}
