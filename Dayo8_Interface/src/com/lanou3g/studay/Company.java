package com.lanou3g.studay;

import javax.print.Doc;

public class Company {
	
	private Teather t;
	private Doctor doc ;
	public Teather getT() {
		return t;
	}
	public void setT(Teather t) {
		this.t = t;
	}
	public Doctor getDoc() {
		return doc;
	}
	public void setDoc(Doctor doc) {
		this.doc = doc;
	}
	
	public  void work(){
		if (t!=null){
			doc.work();
		}
		if (t!=null){
			t.work();
		}
	}


}
