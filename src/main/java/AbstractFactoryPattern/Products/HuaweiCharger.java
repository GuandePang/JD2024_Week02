package AbstractFactoryPattern.Products;

import FactoryPattern.Products.Phone;

public class HuaweiCharger extends Charger{
    @Override
    public void Charge(Phone phone) {
        System.out.println("华为充电器给" + phone + "充电");
    }
}
