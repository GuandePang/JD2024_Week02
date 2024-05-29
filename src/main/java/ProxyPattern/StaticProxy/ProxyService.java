package ProxyPattern.StaticProxy;

import java.security.PrivateKey;

public class ProxyService implements IService{
    //代理的服务实现
    private IService target;

    public ProxyService(IService target){
        this.target = target;
    }
    @Override
    public void compute() {
        System.out.println("极限校验");
        target.compute();
        System.out.println("资源回收");
    }
}
