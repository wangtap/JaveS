package homework;
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
		System.out.println("请输入用户名");
		String  use=scanner.nextLine();
		System.out.println("请输入密码");
		String  password=scanner.nextLine();
		
		UserInter fan=login.login(UserData.date,use,password);
	Person p=(Person )fan;

		if (fan!=null){
	System.out.println("当前用户名为"+use+"职业为"+fan+"当前时间为"+
new SimpleDateFormat("GG-yyyy-MM-dd hh:mm:ss").format(System.currentTimeMillis()));
		System.out.println("是否开始工作：1，是 2，否");
		int  work=scanner.nextInt();
		 if (work==1){
			 fan.onLine();
		 }else if (work==2){
			 fan.offLine();
		 }else {
			System.out.println("请输入正确参数");
		}temp=false;
      } else  {System.out.println("用户名或密码错误\n请重新输入用户名和密码");} 
    }	
  }
 }
