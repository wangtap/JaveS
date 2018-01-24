package com.lanou.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component//注册成bean
@Aspect//将Transaction作为一个切面来使用
@EnableAspectJAutoProxy(proxyTargetClass = true)
//不管目标类是否实现接口，我都想用CGLIB的方式实现动态代理
public class MyTransaction {

    //    在切面类中
    /*各种通知方法，都通过下面这个方法的名字
    找到这里定义的切入点表达式
    再由切入点表达式，找到我们定义的切入点
    * */
    @Pointcut("execution(String com.lanou.aop.UserDaoImpl.*(..))")
    public void pointCut(){
        System.out.println("------pointCut--------");

    }
    //在切入点前执行
    @Before("pointCut()")
    public void begin(JoinPoint joinPoint){
        System.out.println("====begin=====连接点：");
        joinPoint.getSignature().getName();
        joinPoint.getTarget().getClass().getName();
        System.out.println("开始了---");
    }

    //当方法成功返回后会执行
    //若方法抛出异常，则不会执行
    //returning = "gets":指定。
    //方法的返回值要传入到 commit的哪个参数中
    @AfterReturning(value = "pointCut()",returning = "gets")
    public void commit(String gets){
        System.out.println("提交了——");
        System.out.println(gets);
    }

    //最终通知
//    不管切入点是否执行成功
    /*（是执行完毕了，还是抛异常了）*/
//    最终通知都会执行
//    相当于try catch中的finally块
    @After("pointCut()")
    public void finallyMethod(){
        System.out.println("=====最终最终，还是放开了手====");
    }

    @AfterThrowing(value = "pointCut()",throwing = "throwable")
    public void pointCutThrow(Throwable throwable){
        System.out.println("异常通知："+throwable.getMessage());
    }

    @Around("pointCut()")
    public String around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("-------兄弟你看我快不快---");
        //继续去执行
        //这个返回值，就是连接点的返回值
        Object proceed = pjp.proceed();
        System.out.println("======around=======");
        return proceed.toString();
    }
}
