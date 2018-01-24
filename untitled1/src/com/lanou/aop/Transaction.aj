package com.lanou.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
//注册成bean
@Aspect
//将Transaction作为是一个切面
public class Transaction {
    /*
    在切面中
    各种通知方法，都通过下面这个方法的名字
    找到这里定义的切入 点表达式
    在有切入点表达式，找到我们指定的那些切入点
     */

//    @Pointcut("execution(* com.lanou.aop.UserDaoImpl.*(..))")
    @Pointcut("execution(* com.lanou.aop.UserDaoImpl.*(..))")
    public void pointCut(){
        System.out.println("---------pointCut---------");
    }

    //在切入点之前执行
    @Before("pointCut()")
    public void begin(JoinPoint joinPoint){
        System.out.println("-------begin-------"+joinPoint.getSignature().getName()
        +joinPoint.getTarget().getClass().getName());
    }


    //当方法成功返回后会执行
    //若方法抛出异常，则不会执行
    @AfterReturning("pointCut()")
    public  void commit(){
        System.out.println("--------commit-------");
    }

    //最终通知
    //不管切入点是否执行成功
    //（是执行完了，都会抛出异常）
    //最终通知都会执行
    //相当于try-catch中的finally
    @After("pointCut()")
    public void finallyMethod(){
        System.out.println("==最终会执行的===========");
    }

    @AfterThrowing(value = "pointCut()",throwing = "throwable")
    public void pointCutThrow(Throwable throwable){
        System.out.println("异常通知:"+throwable.getMessage());
    }


    @Around("pointCut()")
    public String around1(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("------快来------");

        //继续去执行
        //这个返回值。就是连接点的返回值
        pjp.proceed();

        System.out.println("======around======");
    return "123";
    }
}
