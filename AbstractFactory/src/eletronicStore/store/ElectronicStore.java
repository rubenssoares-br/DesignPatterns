package eletronicStore.store;

import eletronicStore.factory.interfaces.CellPhone;
import eletronicStore.factory.interfaces.Charger;
import eletronicStore.factory.interfaces.Headphone;

public abstract class ElectronicStore {
    public abstract Headphone createHeadphone();
    public abstract CellPhone createCellPhone();
    public abstract Charger createCharger();
}
