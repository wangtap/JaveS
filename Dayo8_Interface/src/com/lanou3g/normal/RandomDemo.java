package com.lanou3g.normal;

import java.util.Random;

public class RandomDemo {
	public static void main (String [] args){
		/*
		 * ȡһ�������
		 * ��Ҫ�õ�Random���������
		 */
		Random random=new Random();
	int   r=random.nextInt();
//		System.out.println(r);

//		ȥһ��0~10[0,10]֮��������
	int e=random.nextInt(11);
	/*
	 * nextInt(bound)���ܵĲ�����һ������ҿ�������[0,bound)
	 */
	
	//		ȥһ��30~45֮��������[30,45]
//	��ʽ��(MAX-MIN+1)+MIN
	int  qq=random.nextInt(45-30+1)+30;
		int q=random.nextInt(16);
		System.out.println(q+=30);
		
//		���ȡһ��true��false
		boolean b =random.nextBoolean();
		System.out.println(b);
		
	}

}
