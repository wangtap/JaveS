package com.lanou3g.inter;

import com.lanou3g.studay.Doctor;
import com.lanou3g.studay.Teather;

public class Main {

	public static void main(String[] args) {
		/*
		 * interface��ʾ�ӿ�
		 * class ��
		 * ����������java����һ�������
		 * ����һ�ֲ��еĹ�ϵ
		 * java�еĽӿڣ���ʾ һ���淶���߹���
		 * 
		 * �����಻��ֱ�Ӵ������󣬵��ǿ���ʹ�ó����������
		 * ����˵�ղŽ���Person���ǳ����� Person p ����һ������
		 * 
		 * 
		 * �ӿ�Ҳ�����ǵģ�Ҳ����ֱ�Ӵ��������ǿ���ʹ�ýӿڵ�����
		 * 
		 * ����Ķ�������־���wd
		 * ���������������
		 * �������û������
		 * ��ô������������
		 * 
		 * 
		 * 
		 */
		WatchDog wd =new WatchDog();
		Company facebook =new  Company();
//		�����work��Ҫ����ȥʲô�أ�
//		facebook.setWork(new Doctor());
		facebook.setWork(new WatchDog());
		facebook.startWork();
		facebook.endWork();
	}

}