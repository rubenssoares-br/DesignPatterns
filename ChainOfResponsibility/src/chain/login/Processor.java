package chain.login;

public abstract class Processor {

    private Processor processor;

    public Processor(Processor processor) {
        this.processor = processor;
    }

    public void process(String type) {
        if (processor != null) {
            processor.process(type);
        }
    }
}
