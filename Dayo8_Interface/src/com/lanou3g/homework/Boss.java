package com.lanou3g.homework;



public class Boss extends Person implements UserInter {
	public Boss( String job) {
		super( job);
	}
	@Override
	public void onLine() {
		System.out.println("老板检查员工");
		发工资();
	}
	@Override
	public void offLine() {
		System.out.println("老板回家");
	}
	public void 发工资(){
		System.out.println("发工资");
	}

}
