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
		System.out.println("------我是父类中getCar方法");
		return color;
	}
	public void setColor(String color) {
		System.out.println("------我是父类中setCar方法"+color);
		this.color = color;
	}

	
public void speed(){
	System.err.println("这俩车加速了");
	}

	
	
	
	

}
