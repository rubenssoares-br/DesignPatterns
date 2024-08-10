package eletronicStore.factory.xiaomi;

import eletronicStore.factory.interfaces.Headphone;

public class XiaomiHeadphone implements Headphone {
    @Override
    public void assemble() {
        System.out.println("Xiaomi Headphone assembled!");
    }
}
