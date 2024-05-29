package CglibProxy;

import ProxyPattern.CglibProxy.ComputerService;
import ProxyPattern.CglibProxy.Proxy;
import ProxyPattern.JDKProxy.ComputeService;

public class ZTest {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new ComputerService());
        ComputeService service = (ComputeService) proxy.getProxyInstance();
        service.compute();
    }
}
