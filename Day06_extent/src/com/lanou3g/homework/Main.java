package com.lanou3g.homework;

public class Main {
	public static void main(String [] args){
		Father father =new Father();
		father.setName("���ưְ�");
		Mother mother=new Mother();
		mother.setName("Χȹ����");
		Child child =new Child();
		child.setName("����");
		
		father.setMother(mother);System.out.println(father.getMother());
		father.setChild(child);
		father.showFamily();
		
		mother.setFather(father);
		mother.setChild(child);
		mother.showFamily();
		
		child.setFather(father);
		child.setMother(mother);System.out.println(child.getMother());
		child.showFamily();
		
	}

}
