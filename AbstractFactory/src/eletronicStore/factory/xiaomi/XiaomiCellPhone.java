package eletronicStore.factory.xiaomi;

import eletronicStore.factory.interfaces.CellPhone;

public class XiaomiCellPhone implements CellPhone {
    @Override
    public void assemble() {
        System.out.println("Xiaomi assembled!");
    }
}
