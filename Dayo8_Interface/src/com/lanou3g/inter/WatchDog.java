package com.lanou3g.inter;
/**
 *  �ĵ�ע��
 *  WatchDog�࣬ͨ��implements�ؼ���
 *  ��Work�ӿڲ����˹���������WatchDog��������Work����ӿڵĹ淶
 *  
 *  imlements �ؼ��֣�ʵ��
 *  ͨ��imlements  �ؼ��֣�������һ����
 *  ʵ�ֶ���ӿڣ�����ӿ�֮��ͨ�����ŷָ�
 *  ������������������˽ӿڵĹ淶
 *  Ҳ��ʵ���˽ӿ�
 *  a�̳���b ����ôa�������࣬b��������
 *  aʵ����c����ôa����ʵ���ࣺʵ�ֽӿ� ����    c�����ӿ�
 *  
 *  
 *  
 *  
 *  
 *  
 */
public class WatchDog implements Work {

	@Override
	public void work() {
		System.out.println("�ϸ��ˣ�˭��ҧ˭");
		
	}

	@Override
	public void go() {
		System.out.println("go");
		
	}

}