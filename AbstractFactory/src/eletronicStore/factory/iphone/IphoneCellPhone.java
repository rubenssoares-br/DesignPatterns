package eletronicStore.factory.iphone;

import eletronicStore.factory.interfaces.CellPhone;

public class IphoneCellPhone implements CellPhone {
    @Override
    public void assemble() {
        System.out.println("Iphone assembled!");
    }
}
