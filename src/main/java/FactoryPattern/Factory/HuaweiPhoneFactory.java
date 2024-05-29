package FactoryPattern.Factory;

import FactoryPattern.Products.HuaweiPhone;
import FactoryPattern.Products.Phone;

public class HuaweiPhoneFactory implements Factory {
    @Override
    public Phone produce() {
        return new HuaweiPhone();
    }
}
