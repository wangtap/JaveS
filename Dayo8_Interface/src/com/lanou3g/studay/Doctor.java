package com.lanou3g.studay;

import com.lanou3g.inter.Work;

public class Doctor extends Person  implements Work {

	@Override
	public void work() {
		System.out.println("�о�����");
		
	}

	@Override
	public void go() {
		System.out.println("d go");
		
	}
	

}
