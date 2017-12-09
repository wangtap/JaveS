package com.lanou3g.homework;

import com.lanou3g.homework.exception.LoginException;
import com.lanou3g.homework.exception.RegisterException;
import org.dom4j.DocumentException;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by zyf on 2017/12/5.
 */
public class Main {

	private static final int REGISTER_CODE = 1;
	private static final int LOGIN_CODE = 2;

	private static final int WORKER = 1;
	private static final int DOCTOR = 2;
	private static final int COOKER = 3;
	private static final int BOSS = 4;


	private static String username = null;
	private static String password = null;



	public static void main(String[] args) throws IOException, DocumentException {
		Scanner input = new Scanner(System.in);
		UserData userData =new UserData();
		while (true) {
			System.out.println("1，注册	2，登录");
			int choice = input.nextInt();
			input.nextLine();
			if (choice!=1&&choice!=2){
				System.out.println("请输入正确的选择参数");
			}
			switch (choice) {
				case REGISTER_CODE:
					System.out.println("请输入姓名：");
					String name = input.nextLine();
					//接收用户名和密码
					receive(input);
					System.out.println("请选择职业：");
					System.out.println("1，工人	2，医生	3，厨师	4，老板");
					int job = input.nextInt();
					if(job!=1&&job!=2&&job!=3&&job!=4){
						System.out.println("请输入正确职业参数 ");
						break;
					}
					Person person = null;
					switch (job){
						case WORKER:
							person = new Worker(name,username,password,"Worker");
							break;
						case DOCTOR:
							person= new Doctor(name,username,password,"Doctor");
							break;
						case COOKER:
							person=new Coooker(name,username,password,"Cooler");
							break;
						case BOSS:
							person=new Boss(name,username,password,"Boss");
							break;
					}
					try {
//						UserOperate.register(person);
						userData.xmlAdd(person);
					} catch (RegisterException e) {
						//将异常的信息提示给用户
						System.out.println(e.getMessage());
						continue;
					}
					break;
				case LOGIN_CODE:
					receive(input);
					try {
						Person person1 = UserOperate.login(username, password);
					} catch (LoginException e) {
						System.out.println(e.getMessage());
						continue;
					}
					break;

			}
		}


	}

	public static void receive(Scanner input) {
		System.out.println("请输入用户名：");
		username = input.nextLine();
		System.out.println("请输入密码：");
		password = input.nextLine();
	}

}
