package com.test.aop;

import com.test.enums.CommonData;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class TestHandle {

    public void handle(ProceedingJoinPoint joinPoint){
        System.out.println("我是前置aop");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.out.println("我是后置aop");

    }


    @Around("execution (* com.test.aop.*.service(..))")
    public Object test(ProceedingJoinPoint joinPoint){

        Object[] args = joinPoint.getArgs();
        System.out.println(args[0].toString());
        Object obj=null;
        try {
            obj=joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return obj;
    }
}
