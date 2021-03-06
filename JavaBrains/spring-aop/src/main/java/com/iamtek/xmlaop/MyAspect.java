package com.iamtek.xmlaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component /*@Aspect*/
public class MyAspect {

    /*@Around("allGet()")*/
    public Object myAdvice1(ProceedingJoinPoint joinPoint) {
        Object obj = null;
        try {
            System.out.println("@Around Advice: Before");
            obj = joinPoint.proceed();
            System.out.println("@Around Advice: AfterReturning");
        } catch (Throwable throwable) {
            System.out.println("@Around Advice: AfterThrowing");
        } finally {
            System.out.println("@Around Advice: After");
        }
        return obj;
    }

    /*@Pointcut("execution(* get*())")
    public void allGet() {
    }*/

}
