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
			System.out.println("1.ע��  2.����");
			String a = scanner.nextLine();

			switch (a) {
				case "1":
					in = true;
					break;
				case "2":
					temp = true;
					break;
				default:
					System.out.println("��������ȷ����");
			}


			while (in) {
				System.out.println("�������������");
				String use1 = scanner.nextLine();

				System.out.println("�������û���");
				String useName1 = scanner.nextLine();

				System.out.println("����������");
				String password1 = scanner.nextLine();

				System.out.println("���������ְҵ");
				String job1 = scanner.nextLine();


				person.setName(use1);
				person.setUsename(useName1);
				person.setPassword(password1);
				person.setJob(job1);
				userOperate.register(person);
				System.out.println("ע��ɹ�");
//				System.out.println(userData.list);
				in = false;


			}

			while (temp) {
				System.out.println("�������û���");
				String use = scanner.nextLine();
				System.out.println("����������");
				String password = scanner.nextLine();
				UserInter fan = login.login(userData.date, use, password);
				Person p = (Person) fan;
				if (fan != null) {
					System.out.println("��ǰ�û���Ϊ" + use + "ְҵΪ" + fan + "��ǰʱ��Ϊ" +
							new SimpleDateFormat("GG-yyyy-MM-dd hh:mm:ss").format(System.currentTimeMillis()));
					System.out.println("�Ƿ�ʼ������1���� 2����");
					int work = scanner.nextInt();
					if (work == 1) {
						fan.onLine();
					} else if (work == 2) {
						fan.offLine();
					} else {
						System.out.println("��������ȷ����");
					}
					temp = false;
				} else {
					System.out.println("�û������������\n�����������û���������");
				}
			}
		}
	}
 }
