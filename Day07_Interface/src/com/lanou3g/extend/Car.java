package com.lanou3g.extend;

import org.ietf.jgss.Oid;

public class Car {
	private int wheels;
	private String color;
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getColor() {
		System.out.println("------���Ǹ�����getCar����");
		return color;
	}
	public void setColor(String color) {
		System.out.println("------���Ǹ�����setCar����"+color);
		this.color = color;
	}

	
public void speed(){
	System.err.println("������������");
	}

	
	
	
	

}
