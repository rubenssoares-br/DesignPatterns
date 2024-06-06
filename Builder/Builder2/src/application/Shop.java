package application;

import phone.Phone;
import phone.PhoneBuilder;

public class Shop {
    public static void main(String[] args) {
        Phone x = new Phone("android", 2, "QualComm", 4.4, 3100, "Samsung");
        System.out.println(x);

       Phone p = new PhoneBuilder().setOs("Android").setBattery(23234).build();

        Phone z = new PhoneBuilder().setRam(4).setOs("Android").setBrand("Motorola").build();
        System.out.println(z);
    }
}
