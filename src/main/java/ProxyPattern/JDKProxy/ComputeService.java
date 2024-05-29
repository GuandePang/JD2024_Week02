package ProxyPattern.JDKProxy;

public class ComputeService implements IService{
    @Override
    public void compute() {
        System.out.println("业务处理");
    }
}
