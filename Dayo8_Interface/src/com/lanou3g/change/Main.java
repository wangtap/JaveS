package com.lanou3g.change;

public class Main {

	public static void main(String[] args) {
//		父类引用指向子类对象
		Father father =new Child();
//		father.work();
		
//父类的引用只能找到父类的方法
//		找不到子类独有的方法
//	father=new Child1();
		father.work();
		if (father instanceof Child){
			/*
			 * 如果father这个引用指向的对象类型为Child
			 * 那么我们可以进行强制类型转换
			 */
			Child ming =(Child)father;
			ming.play();
			ming.work();
			
		}
		
	}

}
