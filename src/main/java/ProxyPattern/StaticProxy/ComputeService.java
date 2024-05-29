package ProxyPattern.StaticProxy;


public class ComputeService implements IService{
    //实际的服务实现
    @Override
    public void compute() {
        System.out.println("业务处理");
    }
}
