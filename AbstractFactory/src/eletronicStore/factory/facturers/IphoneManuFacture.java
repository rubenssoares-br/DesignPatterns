package eletronicStore.factory.facturers;

import eletronicStore.factory.interfaces.CellPhone;
import eletronicStore.factory.interfaces.Charger;
import eletronicStore.factory.interfaces.Headphone;
import eletronicStore.factory.iphone.IphoneCellPhone;
import eletronicStore.factory.iphone.IphoneCharger;
import eletronicStore.factory.iphone.IphoneHeadphone;
import eletronicStore.store.ElectronicStore;

public class IphoneManuFacture extends ElectronicStore {
    @Override
    public Headphone createHeadphone() {
        return new IphoneHeadphone();
    }

    @Override
    public CellPhone createCellPhone() {
        return new IphoneCellPhone();
    }

    @Override
    public Charger createCharger() {
        return new IphoneCharger();
    }
}
