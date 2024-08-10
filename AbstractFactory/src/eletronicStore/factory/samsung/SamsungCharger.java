package eletronicStore.factory.samsung;

import eletronicStore.factory.interfaces.Charger;

public class SamsungCharger implements Charger {
    @Override
    public void assemble() {
        System.out.println("Samsung charger assembled!");
    }
}
