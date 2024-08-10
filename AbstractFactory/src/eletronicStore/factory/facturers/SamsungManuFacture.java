package eletronicStore.factory.facturers;

import eletronicStore.factory.interfaces.CellPhone;
import eletronicStore.factory.interfaces.Charger;
import eletronicStore.factory.interfaces.Headphone;
import eletronicStore.factory.samsung.SamsungCellPhone;
import eletronicStore.factory.samsung.SamsungCharger;
import eletronicStore.factory.samsung.SamsungHeadphone;
import eletronicStore.store.ElectronicStore;

public class SamsungManuFacture extends ElectronicStore {
    @Override
    public Headphone createHeadphone() {
        return new SamsungHeadphone();
    }

    @Override
    public CellPhone createCellPhone() {
        return new SamsungCellPhone();
    }

    @Override
    public Charger createCharger() {
        return new SamsungCharger();
    }
}
