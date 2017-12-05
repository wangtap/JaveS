package homework;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		boolean in = false;
		boolean temp = false;

		Scanner scanner = new Scanner(System.in);
		UserOperate userOperate = new UserOperate();
		Person person = new Person();
		Login login = new Login();
		UserData userData = new UserData();
		userData.qq();


		while (true) {
			System.out.println("1.注册  2.登入");
			String a = scanner.nextLine();

			switch (a) {
				case "1":
					in = true;
					break;
				case "2":
					temp = true;
					break;
				default:
					System.out.println("请输入正确的数");
			}


			while (in) {
				System.out.println("请输入你的名字");
				String use1 = scanner.nextLine();

				System.out.println("请输入用户名");
				String useName1 = scanner.nextLine();

				System.out.println("请输入密码");
				String password1 = scanner.nextLine();

				System.out.println("请输入你的职业");
				String job1 = scanner.nextLine();


				person.setName(use1);
				person.setUsename(useName1);
				person.setPassword(password1);
				person.setJob(job1);
				userOperate.register(person);
				System.out.println("注册成功");
//				System.out.println(userData.list);
				in = false;


			}

			while (temp) {
				System.out.println("请输入用户名");
				String use = scanner.nextLine();
				System.out.println("请输入密码");
				String password = scanner.nextLine();
				UserInter fan = login.login(userData.date, use, password);
				Person p = (Person) fan;
				if (fan != null) {
					System.out.println("当前用户名为" + use + "职业为" + fan + "当前时间为" +
							new SimpleDateFormat("GG-yyyy-MM-dd hh:mm:ss").format(System.currentTimeMillis()));
					System.out.println("是否开始工作：1，是 2，否");
					int work = scanner.nextInt();
					if (work == 1) {
						fan.onLine();
					} else if (work == 2) {
						fan.offLine();
					} else {
						System.out.println("请输入正确参数");
					}
					temp = false;
				} else {
					System.out.println("用户名或密码错误\n请重新输入用户名和密码");
				}
			}
		}
	}
 }
