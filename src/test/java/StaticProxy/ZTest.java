package StaticProxy;

import ProxyPattern.StaticProxy.ComputeService;
import ProxyPattern.StaticProxy.ProxyService;

public class ZTest {
    public static void main(String[] args) {
        ProxyService proxyService = new ProxyService(new ComputeService());
        proxyService.compute();
    }
}
