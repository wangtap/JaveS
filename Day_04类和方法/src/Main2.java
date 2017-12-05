

public class Main2 {
	/*
	 * main是主程序的主入口
	 * 当JAVA运行时
	 * 就会从这里开始运行
	 */
	public static void main(String [] args){
		/*
		 * 当你创建好了之后
		 * 需要创建对象才能使用
		 */
		//Father ff=new Father();
		//使用对象，调用他的方法做一些事情
		//对象名.方法名();
		//ff.showInfo();
		//对象名.属性
		//System.out.println(ff.name);
		Student zhangsan =new Student();
		//对象名.属性名=属性值；
//		这是一个赋值过程   System.out.println();public static void main(String[] args)
		
		zhangsan.name="王老六";
		zhangsan .school ="蓝欧科技欢迎你";
		System.out.println(zhangsan.name);
//		对象名调用方法
//		使用zhangsan这个对象
//		调用play这个方法
		
		zhangsan.play();
		zhangsan.买外卖(100);
        zhangsan.add(-100,- 0);
        
        String q=zhangsan.hot("冷面");
		System.out.println(q);
	}
}
