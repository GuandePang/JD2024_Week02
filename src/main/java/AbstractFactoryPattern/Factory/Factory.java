package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Products.Charger;
import FactoryPattern.Products.Phone;

public interface Factory {
    Phone producePhone();
    Charger produceCharger();
}
