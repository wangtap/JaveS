package com.lanou3g.realtoday.exception;

public class NotEnoughException extends  EatException {
    /*
    现在我们自己就自定义了异常，继承Exception

     */

    @Override
    public String getMessage() {
        return "我是真的没吃饱，还要吃";
    }
}
