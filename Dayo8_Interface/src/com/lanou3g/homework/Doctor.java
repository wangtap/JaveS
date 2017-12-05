package com.lanou3g.homework;

public class Doctor   extends Person  implements UserInter{

	public Doctor( String job) {
		super( job);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onLine() {
		System.out.println("医生手术做完了");
		白大褂();
	}

	@Override
	public void offLine() {
		System.out.println("医生做完回家了");
		
	}
	
	
	
	
	
	
	public void 白大褂(){
		System.out.println("白大褂");
		
	}

}
