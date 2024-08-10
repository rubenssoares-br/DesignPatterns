package eletronicStore.factory.xiaomi;

import eletronicStore.factory.interfaces.Charger;

public class XiaomiCharger implements Charger {
    @Override
    public void assemble() {
        System.out.println("Xiaomi Charger assembled!");
    }
}
