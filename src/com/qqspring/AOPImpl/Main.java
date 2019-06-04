package com.qqspring.AOPImpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        1.创建Spring的IOC容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");

//        2.从IOC容器中获取bean实例
        AtithmeticCalculator atithmeticCalculator=ctx.getBean(AtithmeticCalculatorImpl.class);
//        3.使用bean
        int result=atithmeticCalculator.add(3,6);
        System.out.println(result);
    }
}
