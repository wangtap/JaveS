package com.lanou3g.homework;

public class Doctor   extends Person  implements UserInter{

	public Doctor( String job) {
		super( job);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onLine() {
		System.out.println("ҽ������������");
		�״��();
	}

	@Override
	public void offLine() {
		System.out.println("ҽ������ؼ���");
		
	}
	
	
	
	
	
	
	public void �״��(){
		System.out.println("�״��");
		
	}

}
