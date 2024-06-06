package phone;

public class Phone {

    private String os;
    private Integer ram;
    private String processor;
    private Double screenSize;
    private Integer battery;
    private String brand;

    public Phone() {
    }

    public Phone(String os, Integer ram, String processor, Double screenSize, Integer battery, String brand) {
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.screenSize = screenSize;
        this.battery = battery;
        this.brand = brand;
    }

    public String getOs() {
        return os;
    }

    public Integer getRam() {
        return ram;
    }

    public String getProcessor() {
        return processor;
    }

    public Double getScreenSize() {
        return screenSize;
    }

    public Integer getBattery() {
        return battery;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", processor='" + processor + '\'' +
                ", screenSize=" + screenSize +
                ", battery=" + battery +
                ", brand='" + brand + '\'' +
                '}';
    }
}
