package com.lanou3g.studay;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * ��������ã�ָ��������Ķ���
		 * ���Ƕ�̬��һ����
		 */
		Person person =new Teather();
		Person p2   =  new Doctor();
		
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("����1����ʦ�ɻ����2��ҽ���ɻ����3��ѧ���Ͽ�");
//		��ȡ����̨�����������ֵ
//		���������������
//		��ִ�е��������ʱ,�������̨һֱ����������,����Ϳ�������
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
