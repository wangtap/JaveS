package com.lanou3g.study;

public class Dog {
	/*
	 * ���췽�������أ�
	 * ��������ͬ�����췽���ķ���������������
	 * �����б�
	 * ��ͬ�����ĸ��������������ͣ�������˳��
	 * ������Ҫ�أ�ֻҪ��һ����ͬ���ǲ����б���ǲ�ͬ��
	 */
	public Dog(){
		System.out.println("����Ĭ�ϵĿղεĹ��췽��");
	}
	
	public Dog(String name){
		System.out.println("���Ǵ������Ĺ��췽��"+name);
	}
	public Dog(String name,int age){
			System.out.println("���Ǵ������Ĺ��췽��"+name);	
	}
	public Dog(int age, String name){
		System.out.println("���Ǵ������Ĺ��췽��"+name);
	}
	/*
	 * ����������
	 *��������ͬ�������б�ͬ
	 *�뷵��ֵ��Ȩ�����η��޹�
	 * 
	 */
	public void eatBone(){
		System.out.println("����Ϊ ���ڳԹ�ͷ");
	}
	public void eatBone(int n ){
		System.out.println("����Ϊ ���ڳԹ�ͷ");
	}
	public String  eatBone(	String n){
		return "��ͷ";
		
	}
}
