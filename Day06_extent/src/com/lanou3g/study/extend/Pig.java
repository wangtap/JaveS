package com.lanou3g.study.extend;

public class Pig extends Animal {
	/*
	 * extend关键字：继承
	 * A   extend   B  
	 * 就是A类继承B类，只能在类的声明时使用
	 * 
	 * 子类继承父类的属性或方法
	 * 然后又定义了自己独有的属性或方法
	 * 这个过程叫做扩展
	 */
	
	public void beKilledToMeat(){
		System.out.println("被杀掉吃肉了");
	}

	public Pig() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pig(String kind) {
		super(kind);
		// TODO Auto-generated constructor stub
	}

}
