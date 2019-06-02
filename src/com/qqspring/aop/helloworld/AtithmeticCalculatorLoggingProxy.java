package com.qqspring.aop.helloworld;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AtithmeticCalculatorLoggingProxy {
    //    要代理的对象
    private AtithmeticCalculator target;

    public AtithmeticCalculatorLoggingProxy(AtithmeticCalculator target){
        this.target=target;
    }
    public AtithmeticCalculator getLoggingProxy(){
        AtithmeticCalculator proxy=null;

        //代理对象由那一个类加载器负责加载
        ClassLoader loader=target.getClass().getClassLoader();
        //代理对象的类型，即其中有哪些方法
        Class [] interfaces=new Class[] {AtithmeticCalculator.class};
        //当调用代理对象其中的方法时，该执行的代码
        InvocationHandler h=new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("invoke....");
                return 0;
            }
        };
        proxy= (AtithmeticCalculator) Proxy.newProxyInstance(loader,interfaces,h);
        return proxy;
    }

}
