package com.lanou3g.statics;

public class Main {

	public static void main(String[] args) {
		/*
		 * 直接使用类名.变量名的方式就可以调用static的属性
		 */
		int a =Statics.score;
//		System.err.println(a);
		Statics.score=200;
 
//		Statics.show();
		Statics t1 = new Statics();
		t1.score=300;t1.setQ(12);
		Statics t2 = new Statics();
//		t2.show();
		t2.setQ(78);
//		System.err.println(t1.getQ());
//		System.err.println(t2.getQ());
		t1.w=1;
		t2.w=2;
		System.err.println(t1.w);
		System.err.println(t2.w);
		
	}
	

}
