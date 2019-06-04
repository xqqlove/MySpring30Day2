package com.qqspring.AOPImpl;



import org.springframework.stereotype.Component;
import org.springframework.test.context.transaction.BeforeTransaction;

//把这个类声明为一个切面

@Component
public class LoggingAspect {
    //声明该方法是一个前置通知：
    public void beforeMethod(){
        System.out.println("The method begins");
    }
}
