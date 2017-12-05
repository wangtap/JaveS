package com.lanou3g.study.extend;

public class Animal {
	
	/*
	 * 什么是继承？
	 * java面向对象编程的三大特性之一
	 * 封装，继承，多态
	 * 子类可以继承父类的属性和方法的
	 * 创建一个类pig，使用extend继承animal
	 */

	private String kind;//表示种族
	public void sleep(){
		System.out.println("shui");
	}
	public Animal(){
		System.out.println("---动物动物-----");
	}
	public Animal (String kind){
		this.kind=kind;
		System.out.println("这个动物的种族为："+kind);
	}
	
	
	
	
	
	
	
	
	
}
