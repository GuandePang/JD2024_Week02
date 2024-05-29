package FactoryPattern.Factory;

import FactoryPattern.Products.Phone;
import FactoryPattern.Products.XiaomiPhone;

public class XiaomiPhoneFactory implements Factory {
    @Override
    public Phone produce() {
        return new XiaomiPhone();
    }
}
