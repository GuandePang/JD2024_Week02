package AbstractFactoryTest;


import AbstractFactoryPattern.Factory.HuaweiPhoneFactory;
import AbstractFactoryPattern.Factory.XiaomiPhoneFactory;

public class ZTest {
    public static void main(String[] args) {
        XiaomiPhoneFactory xiaomiPhoneFactory = new XiaomiPhoneFactory();
        HuaweiPhoneFactory huaweiPhoneFactory = new HuaweiPhoneFactory();
        xiaomiPhoneFactory.produceCharger().Charge(xiaomiPhoneFactory.producePhone());
        huaweiPhoneFactory.produceCharger().Charge(huaweiPhoneFactory.producePhone());
    }
}
