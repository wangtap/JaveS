package com.lanou3g.realtoday.exception;

public class NotEnoughException extends  EatException {
    /*
    ���������Լ����Զ������쳣���̳�Exception

     */

    @Override
    public String getMessage() {
        return "�������û�Ա�����Ҫ��";
    }
}
