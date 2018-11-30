package com.jd.section;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 加减乘除，cglib代理
 * 能代理接口和类，不能代理final类
 * @author wl
 * @date 2018/11/30
 */
public class CalculatorInterceptor implements MethodInterceptor{
    private Object target;

    public CalculatorInterceptor(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib proxy");
        System.out.println("o = [" + o + "], method = [" + method.getName()+ "], objects = [" + objects + "], methodProxy = [" + methodProxy + "]");
        Object result = methodProxy.invoke(target,objects);
        return result;
    }

    public Object proxy() {
        return Enhancer.create(target.getClass(),new CalculatorInterceptor(target));
    }
}
