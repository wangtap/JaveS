package com.lanou3g.change;

public class Main {

	public static void main(String[] args) {
//		��������ָ���������
		Father father =new Child();
//		father.work();
		
//���������ֻ���ҵ�����ķ���
//		�Ҳ���������еķ���
//	father=new Child1();
		father.work();
		if (father instanceof Child){
			/*
			 * ���father�������ָ��Ķ�������ΪChild
			 * ��ô���ǿ��Խ���ǿ������ת��
			 */
			Child ming =(Child)father;
			ming.play();
			ming.work();
			
		}
		
	}

}