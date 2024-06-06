package phone;

public class PhoneBuilder {

    private String os;
    private Integer ram;
    private String processor;
    private Double screenSize;
    private Integer battery;
    private String brand;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setBattery(Integer battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }



    public Phone build() {
        return new Phone(os, ram, processor, screenSize, battery, brand);
    }
}
