package com.lanou3g.realtoday.exception;

public class ChunLai {
    /*
    throw �ڷ������ڲ����׳� һ���쳣����ʱʹ��
    throws �ڷ����������ϣ���������������׳����쳣����

    �����������ǻ��׳�һ���쳣����ʱʹ��
    �ڷ����������ϣ���������������׳����쳣����
     */
    public void eat(int weight) throws EatException {
        if (weight<200){
            //��ʾû�Ա�
//            �����׳�һ���쳣�����ߵ���eat�����ĵط�˵�����ϵ��е��٣�������
            throw  new NotEnoughException();
        }
        if (weight>300){
//            ��ʾ�Զ���
            throw  new ToomuchException();
        }
    }
}
