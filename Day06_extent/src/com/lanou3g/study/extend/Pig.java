package com.lanou3g.study.extend;

public class Pig extends Animal {
	/*
	 * extend�ؼ��֣��̳�
	 * A   extend   B  
	 * ����A��̳�B�ֻ࣬�����������ʱʹ��
	 * 
	 * ����̳и�������Ի򷽷�
	 * Ȼ���ֶ������Լ����е����Ի򷽷�
	 * ������̽�����չ
	 */
	
	public void beKilledToMeat(){
		System.out.println("��ɱ��������");
	}

	public Pig() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pig(String kind) {
		super(kind);
		// TODO Auto-generated constructor stub
	}

}