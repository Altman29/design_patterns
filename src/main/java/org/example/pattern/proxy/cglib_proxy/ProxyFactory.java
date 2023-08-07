package org.example.pattern.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory {

    //声明火车站对象
    private TransStation transStation = new TransStation();

    public TransStation getProxyInstance() {
        //创建Enhancer对象，类似JDK代理中的Proxy类
        Enhancer enhancer = new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(TransStation.class);
        //设置回调函数
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("代理点收取一定的服务费用(CGlib动态代理)");
                Object invoke = method.invoke(transStation, objects);
                return invoke;
            }
        });
        //创建子类对象，即代理对象
        TransStation proxyObject = (TransStation) enhancer.create();
        return proxyObject;
    }
}
