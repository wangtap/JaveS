package com.lanou3g.study.extend;

public class Monkey extends Animal {
	
	public Monkey() {
		//super()�����ڵ��ø���Ŀղι��췽��
//		super("����")�����ڵ��ø���Ĳ�������ΪString�Ĺ��췽��
	    super("����");
		System.out.println("i am a �����ʥ");
	
	}

	//@Override
	public void sleep() {
//		super.sleep()���ڵ��ø����sleep����
		System.out.println("���Ǻ��ӵ�˯������");
		super.sleep();
	}

}
