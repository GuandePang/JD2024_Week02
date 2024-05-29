package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Products.Charger;
import AbstractFactoryPattern.Products.HuaweiCharger;
import FactoryPattern.Products.HuaweiPhone;
import FactoryPattern.Products.Phone;

public class HuaweiPhoneFactory implements Factory{

    @Override
    public Phone producePhone() {
        return new HuaweiPhone();
    }

    @Override
    public Charger produceCharger() {
        return new HuaweiCharger();
    }
}
