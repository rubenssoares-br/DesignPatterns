package eletronicStore.factory.samsung;

import eletronicStore.factory.interfaces.Headphone;

public class SamsungHeadphone implements Headphone {
    @Override
    public void assemble() {
        System.out.println("Samsung Headphone assembled!");
    }
}
