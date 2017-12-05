
public class Car {
	/*
	 * 现实生活中的车
	 * 可以加速，减速，转弯
	 * 有车牌号，有重量，有生产商的信息在JAVA的编程世界中我们
	 * 可以创建一个类，起名叫Car来表示生活中的车
	 * 那么车的信息和车可以做的事
	 * Car都应该拥有
	 * 当我们与车有关的内容，写在car这个类中
	 * 时，我们就可以说，把车抽象成了car这个类
	 * 因为车是真的存在的
	 * car是我们编程的语言
	 */

	/*
	 *生活中的信息  类中的属性
	 *生活中的动作    类中的方法
	 * 
	 */
	    //车牌
	//mark是没有值的，没有内容的这个时候的过程是定义
		String mark/*="eA888888"*/;
		//车的颜色
		String color="yellow";
	public  void showInfo (){
		//System.out.println();
		/*
		 * showInfo就是这个类中的行为所有根据这个类创建的类都有这个行为
		 */
		System.out.println("车牌号是："+mark+"颜色是："+color);
	}
}
