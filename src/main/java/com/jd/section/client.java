package com.jd.section;

/**
 * @author wl
 * @date
 */
public class client {
    public static void main(String[] args) throws Exception {
        ICalculator calculatorProxy = (ICalculator) new CalculatorInvocationHandler(new Calculator()).getProxy();
        calculatorProxy.add(10,10);

//        Calculator calculator = (Calculator) new CalculatorInvocationHandler(new Calculator()).getProxy();
//        calculator.add(5,5);

        Calculator calculator = (Calculator) new CalculatorInterceptor(
                new Calculator()).proxy();
        calculator.add(20, 20);
    }
}
