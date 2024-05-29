package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Products.Charger;
import AbstractFactoryPattern.Products.XiaomiCharger;
import FactoryPattern.Products.Phone;
import FactoryPattern.Products.XiaomiPhone;


public class XiaomiPhoneFactory implements Factory{
    @Override
    public Phone producePhone() {
        return new XiaomiPhone();
    }

    @Override
    public Charger produceCharger() {
        return new XiaomiCharger();
    }
}
