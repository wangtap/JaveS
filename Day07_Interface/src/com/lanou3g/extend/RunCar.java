package com.lanou3g.extend;

public class RunCar extends Car {
	//�ܳ��ļ��٣�Ӧ�ñ�һ��Ŀ죬
//	�������Ǹ�д����Car�ļ��ٷ���
//	��д�����ǰѴӸ����м̳еķ����޸�
	@Override//ע�⣺���ע�����������Ǽ��speed�����Ƿ�Ӹ���̳�����
	//
	public void speed(){
		super.speed();
		System.out.println("���ٶ�Ϊ240");
		
	}
	
}