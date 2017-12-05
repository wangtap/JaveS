package com.lanou3g.homework;

public class Mother {
	 private  Father  father ;
	 private Child child;
	 private String name;
	public Father getFather() {
		return father;
	}
	public void setFather(Father father) {
		this.father = father;
	}
	public Child getChild() {
		return child;
	}
	public void setChild(Child child) {
		this.child = child;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void showFamily(){
		System.out.println("他的丈夫是"+father.getName()+"他的孩子是"+child.getName());
	}
	 

}
