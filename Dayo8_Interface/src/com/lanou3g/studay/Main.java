package com.lanou3g.studay;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * 父类的引用，指向了子类的对象
		 * 这是多态的一部分
		 */
		Person person =new Teather();
		Person p2   =  new Doctor();
		
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("输入1，老师干活，输入2，医生干活，输入3，学生上课");
//		获取控制台的输入的整数值
//		这个方法有阻塞性
//		当执行到这个方法时,如果控制台一直不输入内容,程序就卡在这里
		int choice=input.nextInt();
		Company2 company2=new Company2();
		
		if(choice==1){
			Teather t =new Teather();
			company2.setPerson(t);
			t.work();
		}else if (choice==2) {
			Doctor doctor=new Doctor();
			company2.setPerson(doctor);
			doctor.work();
		}else if(choice==3){
			Student studay=new Student();
			company2.setPerson(studay);
			studay.work();
			
					
		}
//		company2.work();
		
	
		
		
		
		

	}

}
