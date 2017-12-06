package com.lanou3g.realtoday.exception;

public class ChunLai {
    /*
    throw 在方法的内部，抛出 一个异常对象时使用
    throws 在方法的声明上，声明这个方法会抛出的异常类型

    这里声明的是会抛出一个异常对象时使用
    在方法的声明上，声明这个方法会抛出的异常类型
     */
    public void eat(int weight) throws EatException {
        if (weight<200){
            //表示没吃饱
//            我们抛出一个异常，告诉调用eat方法的地方说你们上的有点少，在来点
            throw  new NotEnoughException();
        }
        if (weight>300){
//            表示吃多了
            throw  new ToomuchException();
        }
    }
}
