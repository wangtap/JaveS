
public class Student {
	/*
	 * 现在这三个都叫属性
	 * 现在这三个属性还没有值呢
	 */
	String name,school;
	int id;
	
	public void play(){
		System.out.println(name+"玩游戏去了");
		
	}
	public void gotoschool(){
		System.out.println(name+"去上学");
	}
	/*
	 * public  权限修饰符
	 * void   返回值类型
	 * void表示是没有反回值
	 * show   方法名
	 * (String str)   参数列表，是可以有多个参数的
	 * String是参数的类型
	 * 调用方法时，需要传入对应类型的内容
	 * str 是参数的名字
	 * 是任意的想怎么写就怎么写但是要见名之意
	 *    {}    方法体：这个方法被调用时，要执行的代码
	 *    
	 */
	public void show(String str){
		
	}
	public  void 买外卖(int money){
		System.out.println("拿着老师的钱"+money+"打游戏去了");
	}
//	让这个学生具备一个加法运算的能力
	public void  add (int a,int b ){
		int sum=a+b;
		System.out.println("和为："+sum);
		//return 1223;
	}
	public String hot (String food ){
		return "加热了的"+food;
	}

}
