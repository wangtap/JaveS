package com.lanou3g.inter;

public class Company {
	private Work work;
	
//	 * Work��һ���ӿ�������Ǵ�����һ���ӿڵ�����
	 
public void  setWork (Work work) {
	this.work=work;
	}
public void startWork() {
	/*
	 * work����ӿڵ�����
	 * ��ָ��һ��ʵ����Ķ���
	 * ������ǵ������ʵ��������work����
	 */

	this.work.work();
}
public void endWork(){
	this.work .go();
}
	
}
