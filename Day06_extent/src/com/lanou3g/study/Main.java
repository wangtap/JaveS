package com.lanou3g.study;

public class Main {
	public static void main(String [] args){
		//我们一直写的new xxx();
//		实际是这个xxx()就是一个构造方法
//		只不过这个构造方法是没有参数的
//		每一个类中都有一个默认的没有参数的构造方法
//		默认的没有参数的构造方法
//		以后没有参数我们就简称空参
//		我们在cat中写了一个带参数的构造方法 
//		那么就会把默认的空参的构造方法覆盖
//		说以这里就会报错  Cat cat=new Cat();
		Person zhangsan =new Person();
		Cat cat=new Cat(zhangsan);
		
		//这是在对象创建后，设置name熟属性
		cat.setName("Tom");
		//给cat设置一个主人
//		cat.setOnwer(zhangsan);
		/*我们的要求是，每个猫被创建出来时就有一个主人
		 * 而set方法 ，是在对象被创建后，才可以调用执行的这不符合我们的要求
		 * java给我们提供了一个叫构造方法的东西
		 * 可以帮助我们，在对象初始化时给属性赋值 
		 */
		
	
		
	}

}
