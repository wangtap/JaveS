package com.lanou3g.homework;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		boolean temp=true;
		while(temp){
		@SuppressWarnings("unused")//???????
		UserData userData=new UserData();
		Login login =new Login();

		
		@SuppressWarnings("resource")//???????
		Scanner scanner=new Scanner(System.in);
		System.out.println("�������û���");
		String  use=scanner.nextLine();
		System.out.println("����������");
		String  password=scanner.nextLine();
		
		UserInter fan=login.login(UserData.date,use,password);
	Person p=(Person )fan;

		if (fan!=null){
	System.out.println("��ǰ�û���Ϊ"+use+"ְҵΪ"+fan+"��ǰʱ��Ϊ"+
new SimpleDateFormat("GG-yyyy-MM-dd hh:mm:ss").format(System.currentTimeMillis()));
		System.out.println("�Ƿ�ʼ������1���� 2����");
		int  work=scanner.nextInt();
		 if (work==1){
			 fan.onLine();
		 }else if (work==2){
			 fan.offLine();
		 }else {
			System.out.println("��������ȷ����");
		}temp=false;
      } else  {System.out.println("�û������������\n�����������û���������");} 
    }	
  }
 }