package FactoryPattern.Products;

public class HuaweiPhone extends Phone{

    @Override
    public void call(String phoneNum) {
        System.out.println("华为手机拨打电话：" + phoneNum);
    }
}
