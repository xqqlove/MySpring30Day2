package com.qqspring.aop.helloworld;

public class Main {
    public static void main(String[] args) {
//        AtithmeticCalculator atithmeticCalculator=null;
//        atithmeticCalculator=new AtithmeticCalculatorImpl();
        AtithmeticCalculator atithmeticCalculator=new AtithmeticCalculatorImpl();
        AtithmeticCalculator proxy =new AtithmeticCalculatorLoggingProxy(atithmeticCalculator).getLoggingProxy();

        int result=proxy.add(1,2);
        System.out.println("-->"+result);



        //jhl
        result=proxy.div(4,2);
        System.out.println("-->"+result);
    }
}
