package ProxyPattern.CglibProxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.io.ObjectStreamException;
import java.lang.reflect.Method;

public class Proxy implements MethodInterceptor {
    private Object target;
    public Proxy(Object target){
        this.target = target;
    }

    public Object getProxyInstance(){
        //创建用于生成动态子类的工具类
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("权限校验");
        Object invoke = method.invoke(target, args);
        System.out.println("资源回收");
        return invoke;
    }
}
