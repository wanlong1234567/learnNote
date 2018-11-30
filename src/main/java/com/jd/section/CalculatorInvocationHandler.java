package com.jd.section;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * 加减乘除，JDK代理
 * 只能代理接口，不能代理类
 */
public class CalculatorInvocationHandler implements InvocationHandler {
    // 动态代理只有在运行时才知道代理谁，所以定义为Object类型
    private Object target = null;
    /**
     * 通过构造函数传入原对象
     *
     * @param target
     *            要代理的对象
     */
    public CalculatorInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * InvocationHandler 接口的 invoke 方法，调用代理的方法
     * @param proxy proxy在其上调用方法的代理实例
     * @param method  method拦截的方法
     * @param args args拦截的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("JDK proxy....");
        System.out.println("the method"+method.getName()+"begin with args"+ Arrays.toString(args));
        Object result= method.invoke(target,args);
        System.out.println("the method:"+method.getName()+"end with result"+result);
        return result;
    }
    /**
     * 获取代理类
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),new CalculatorInvocationHandler(target));
    }
}
