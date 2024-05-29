package FactoryTest;

import FactoryPattern.Factory.HuaweiPhoneFactory;
import FactoryPattern.Factory.XiaomiPhoneFactory;

public class ZTest {
    public static void main(String[] args) {
        XiaomiPhoneFactory xiaomiPhoneFactory = new XiaomiPhoneFactory();
        HuaweiPhoneFactory huaweiPhoneFactory = new HuaweiPhoneFactory();
        xiaomiPhoneFactory.produce().call("123");
        huaweiPhoneFactory.produce().call("456");
    }
}
