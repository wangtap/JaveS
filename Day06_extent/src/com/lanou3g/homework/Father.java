package com.lanou3g.homework;

public class Father {
	private  String name;//��ʾ���׵�����
	private Mother mother;
	private Child child;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Mother getMother() {
		return mother;
	}
	public void setMother(Mother mother) {
		this.mother = mother;
	}
	public Child getChild() {
		return child;
	}
	public void setChild(Child child) {
		this.child = child;
	}
	public void showFamily(){
		System.out.println("����������"+mother.getName()+"���ĺ�����"+child.getName());
	}
	
		
			

}
