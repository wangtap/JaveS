package com.lanou3g.realtoday.exception;

public class ToomuchException extends  EatException {
    @Override
    public String getMessage() {
        return "不知不觉，撑死了";
    }
}
