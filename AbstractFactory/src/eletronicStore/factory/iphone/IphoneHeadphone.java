package eletronicStore.factory.iphone;

import eletronicStore.factory.interfaces.Headphone;

public class IphoneHeadphone implements Headphone {
    @Override
    public void assemble() {
        System.out.println("Iphone headphone assembled!");
    }
}
