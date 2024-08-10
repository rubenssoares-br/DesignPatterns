package eletronicStore.application;

import eletronicStore.factory.facturers.IphoneManuFacture;
import eletronicStore.factory.facturers.XiaomiManuFacture;
import eletronicStore.factory.interfaces.CellPhone;
import eletronicStore.factory.interfaces.Charger;
import eletronicStore.factory.interfaces.Headphone;
import eletronicStore.factory.iphone.IphoneCellPhone;
import eletronicStore.factory.iphone.IphoneCharger;
import eletronicStore.store.ElectronicStore;

public class Application {

    public static void main(String[] args) {
        ElectronicStore Iphone = new IphoneManuFacture();

        CellPhone iphoneCellPhone = Iphone.createCellPhone();
        Charger iphoneCharger = Iphone.createCharger();
        Headphone iphoneHeadphone = Iphone.createHeadphone();

        ElectronicStore Xiaomi = new XiaomiManuFacture();

        CellPhone xiaomiCellPhone = Xiaomi.createCellPhone();
        Charger xiaomiCharger = Xiaomi.createCharger();
        Headphone xiaomiHeadphone = Xiaomi.createHeadphone();

    }

}
