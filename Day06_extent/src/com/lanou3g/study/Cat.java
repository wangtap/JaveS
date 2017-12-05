package com.lanou3g.study;

public class Cat {
	private String name;
    private Person onwer;
/*
 * 构造方法：
 * 1，方法名与类名相同
 * 2，没有返回值这个功能
 * 有了构造方法，还要set/get干什么
 * 首先第一点，get是一定要有的，否者
 * 在类的外面是无法获得私有属性的
 * 
 * 关于set：
 * 有些属性，并不是每个对象都要具有的
 * 比如cat可能有一个伴侣，但是并不是 每个cat
 * 在初始化时都马上有一个伴侣
 * 所以可以在后续的使用中通过set方法给他设置一个
 * 对于初始化就有这个omwer属性很可能这个猫被卖了，那就需要换个主人，
 * 这个时候也可以使用set方法去修改属性
 */
    
    
    
    
    public Cat(Person onwer){
    	//将括号中的参数onwer的值
    	//赋值给了属性的onwer
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
