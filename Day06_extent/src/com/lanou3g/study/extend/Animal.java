package com.lanou3g.study.extend;

public class Animal {
	
	/*
	 * ʲô�Ǽ̳У�
	 * java��������̵���������֮һ
	 * ��װ���̳У���̬
	 * ������Լ̳и�������Ժͷ�����
	 * ����һ����pig��ʹ��extend�̳�animal
	 */

	private String kind;//��ʾ����
	public void sleep(){
		System.out.println("shui");
	}
	public Animal(){
		System.out.println("---���ﶯ��-----");
	}
	public Animal (String kind){
		this.kind=kind;
		System.out.println("������������Ϊ��"+kind);
	}
	
	
	
	
	
	
	
	
	
}