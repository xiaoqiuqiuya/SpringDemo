package com.nice.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    public void log(){
        System.out.println("添加log");
    }
//    前置通知
    public void before(JoinPoint jp){
        System.out.println("前置通知--目标对象："+jp.getTarget()+"被增强处理的方法："+jp.getSignature().getName());
    }
//    后置返回通知
    public void afterReturn(JoinPoint joinPoint){
        System.out.println("后置返回通知--被增强处理的方法："+joinPoint.getSignature().getName());

    }
//    环绕通知，返回的类型必须是一个Object，需要传入参数ProceedingJoinPoint，还要抛出异常Throwable
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕开始");
        Object o = proceedingJoinPoint.proceed();
        System.out.println("环绕结束");
        return  o;
    }

//    异常通知
    public void except(Throwable throwable){
        System.out.println("异常通知，程序执行异常:"+throwable.getMessage());
    }


//    后置通知
    public void after(){
        System.out.println("最终通知");
    }








}
