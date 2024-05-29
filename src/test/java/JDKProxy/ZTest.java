package JDKProxy;

import ProxyPattern.JDKProxy.ComputeService;
import ProxyPattern.JDKProxy.IService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ZTest {
    public static void main(String[] args) {
        //创建实际服务对象
       final ComputeService target = new ComputeService();
       //创建代理实例
       IService proxyInstance = (IService) Proxy.newProxyInstance(
               target.getClass().getClassLoader(),
               target.getClass().getInterfaces(),
               new InvocationHandler() {
                   @Override
                   public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                       System.out.println("权限校验");
                       Object invoke = method.invoke(target, args);
                       System.out.println("资源回收");
                       return invoke;
                   }
               }
       );
       proxyInstance.compute();
    }
}
