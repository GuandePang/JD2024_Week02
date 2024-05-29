package SimpleFactoryTest;

import SimpleFactoryPattern.PhoneFactory.PhoneFactory;

public class ZTest {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        phoneFactory.getPhone("xiaomi").call("123");
        phoneFactory.getPhone("huawei").call("321");
    }
}
