package org.example.pattern.proxy.jdk_proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 获取代理对象的工厂类
 * 代理类也实现了同一个接口
 */
public class ProxyFactory {

    //声明目标对象
    private TransStation transStation = new TransStation();


    /**
     * 获取代理对象的方法
     * @return
     */
    public SellTickets getProxyInstance() {
        //返回代理对象
        /*
        ClassLoader var0, 类加载器，用于加载代理类，可以传入目标对象的类加载器
        Class<?>[] var1, 代理类实现的接口的字节码对象
        InvocationHandler var2， 代理类的调用处理程序，可以传入目标对象
         */
        SellTickets proxyInstance = (SellTickets) Proxy.newProxyInstance(
                transStation.getClass().getClassLoader(),
                transStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     *  object, 代理对象，一般不用
                     *  method，目标对象的方法对象
                     *  objects，调用方法的实际参数
                     *  返回值，目标对象方法的返回值
                     */
                    public Object invoke(Object object, Method method, Object[] objects) throws Throwable {
                        System.out.println("代理点收取一定的服务费用(jdk动态代理)");
                        //执行目标对象的方法
                        Object invoke = method.invoke(transStation, objects);
                        return invoke;
                    }
                }
        );
        return proxyInstance;
    }
}
