package eletronicStore.factory.facturers;

import eletronicStore.factory.interfaces.CellPhone;
import eletronicStore.factory.interfaces.Charger;
import eletronicStore.factory.interfaces.Headphone;
import eletronicStore.factory.xiaomi.XiaomiCellPhone;
import eletronicStore.factory.xiaomi.XiaomiCharger;
import eletronicStore.factory.xiaomi.XiaomiHeadphone;
import eletronicStore.store.ElectronicStore;

public class XiaomiManuFacture extends ElectronicStore {
    @Override
    public Headphone createHeadphone() {
        return new XiaomiHeadphone();
    }

    @Override
    public CellPhone createCellPhone() {
        return new XiaomiCellPhone();
    }

    @Override
    public Charger createCharger() {
        return new XiaomiCharger();
    }

}
