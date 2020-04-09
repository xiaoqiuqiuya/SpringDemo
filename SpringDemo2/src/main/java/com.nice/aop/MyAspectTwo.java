package com.nice.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class MyAspectTwo {
    //    定义切入点
    @Pointcut("execution(* com.nice.daoImpl.StuDaoImpl.save())")
    public void myPointCut() {
    }

    @Before("myPointCut()")
    public void before(JoinPoint jp) {
        System.out.println("前置通知--目标对象：" + jp.getTarget() + "被增强处理的方法：" + jp.getSignature().getName());
    }

    @AfterReturning("myPointCut()")
    public void afterReturn(JoinPoint joinPoint) {
        System.out.println("后置返回通知--被增强处理的方法：" + joinPoint.getSignature().getName());

    }

    @Around("myPointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕开始");
        Object o = proceedingJoinPoint.proceed();
        System.out.println("环绕结束");
        return o;
    }

    @AfterThrowing(value = "myPointCut()", throwing = "throwable")
    public void except(Throwable throwable) {
        System.out.println("异常通知，程序执行异常:" + throwable.getMessage());
    }

    @After("myPointCut()")
    public void after() {
        System.out.println("最终通知");
    }

}
