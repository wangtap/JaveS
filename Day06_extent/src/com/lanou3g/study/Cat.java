package com.lanou3g.study;

public class Cat {
	private String name;
    private Person onwer;
/*
 * ���췽����
 * 1����������������ͬ
 * 2��û�з���ֵ�������
 * ���˹��췽������Ҫset/get��ʲô
 * ���ȵ�һ�㣬get��һ��Ҫ�еģ�����
 * ������������޷����˽�����Ե�
 * 
 * ����set��
 * ��Щ���ԣ�������ÿ������Ҫ���е�
 * ����cat������һ�����£����ǲ����� ÿ��cat
 * �ڳ�ʼ��ʱ��������һ������
 * ���Կ����ں�����ʹ����ͨ��set������������һ��
 * ���ڳ�ʼ���������omwer���Ժܿ������è�����ˣ��Ǿ���Ҫ�������ˣ�
 * ���ʱ��Ҳ����ʹ��set����ȥ�޸�����
 */
    
    
    
    
    public Cat(Person onwer){
    	//�������еĲ���onwer��ֵ
    	//��ֵ�������Ե�onwer
    	this.onwer=onwer;
    	
    }
    
    
	public Person getOnwer() {
		return onwer;
	}

	public void setOnwer(Person onwer) {
		this.onwer = onwer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
