package chain.login;

public class LoggingChain {

    Processor chain;

    public LoggingChain() {
        this.chain = new FileLogger(new DbLogger(new ConsoleLogger(null)));
    }

    public void process(String type) {
        chain.process(type);
    }

}