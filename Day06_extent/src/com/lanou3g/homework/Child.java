package com.lanou3g.homework;

public class Child {
private Mother mother;
private  Father  father ;
private String name;
private int a;
private String qqq;

public int getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
}
public String getQqq() {
	return qqq;
}
public void setQqq(String qqq) {
	this.qqq = qqq;
}
public Mother getMother() {
	return mother;
}
public void setMother(Mother mother) {
	this.mother = mother;
}
public Father getFather() {
	return father;
}
public void setFather(Father father) {
	this.father = father;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void showFamily(){
	System.out.println("他的妈妈是"+mother.getName()+"他的爸爸是"+father.getName());
}

}
