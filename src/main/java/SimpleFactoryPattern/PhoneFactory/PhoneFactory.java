package SimpleFactoryPattern.PhoneFactory;

import SimpleFactoryPattern.Products.HuaweiPhone;
import SimpleFactoryPattern.Products.Phone;
import SimpleFactoryPattern.Products.XiaomiPhone;

public class PhoneFactory {

    public Phone getPhone(String type){
        if("xiaomi".equalsIgnoreCase(type)){
            return new XiaomiPhone();
        } else if("huawei".equalsIgnoreCase(type)){
            return new HuaweiPhone();
        }
        return null;
    }
}
