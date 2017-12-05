package com.lanou3g.homework;

public class Cooker extends Person  implements UserInter{

	public Cooker( String job) {
		super( job);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void onLine() {
		System.out.println("厨师开始做菜了");
		做菜();
	}
@Override
	public void offLine() {
		System.out.println("厨师做完了");
	}
	public void 做菜(){
		System.out.println("做菜");
	}
	
	
	

}
