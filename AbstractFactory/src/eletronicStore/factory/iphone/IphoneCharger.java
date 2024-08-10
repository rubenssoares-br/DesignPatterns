package eletronicStore.factory.iphone;

import eletronicStore.factory.interfaces.Charger;

public class IphoneCharger implements Charger {
    @Override
    public void assemble() {
        System.out.println("Iphone charger assembled!");
    }
}
