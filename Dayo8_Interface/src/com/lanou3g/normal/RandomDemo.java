package com.lanou3g.normal;

import java.util.Random;

public class RandomDemo {
	public static void main (String [] args){
		/*
		 * 取一个随机数
		 * 需要用到Random这个工具类
		 */
		Random random=new Random();
	int   r=random.nextInt();
//		System.out.println(r);

//		去一个0~10[0,10]之间的随机数
	int e=random.nextInt(11);
	/*
	 * nextInt(bound)接受的参数是一个左闭右开的区间[0,bound)
	 */
	
	//		去一个30~45之间的随机数[30,45]
//	公式：(MAX-MIN+1)+MIN
	int  qq=random.nextInt(45-30+1)+30;
		int q=random.nextInt(16);
		System.out.println(q+=30);
		
//		随机取一个true或false
		boolean b =random.nextBoolean();
		System.out.println(b);
		
	}

}
