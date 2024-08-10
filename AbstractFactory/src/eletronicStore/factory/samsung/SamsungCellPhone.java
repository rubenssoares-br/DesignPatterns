package eletronicStore.factory.samsung;

import eletronicStore.factory.interfaces.CellPhone;

public class SamsungCellPhone implements CellPhone {
    @Override
    public void assemble() {
        System.out.println("Samsung assembled!");
    }
}
