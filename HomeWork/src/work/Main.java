package work;

import org.dom4j.DocumentException;
import work.Weather.WeatherReportByCity;
import work.tool.*;


import java.io.IOException;
import java.util.Scanner;

import static work.Weather.WeatherReportByCity.GetTodayTemperatureByCity;
import static work.phone.AddressReportByPhone.GetAddressReportByPhone;

public class Main {
    public static void main(String[] args) throws IOException, DocumentException {
        Scanner input = new Scanner(System.in);
        RegisterAndLogin registerAndLogin =new RegisterAndLogin();

        System.out.println("欢迎来到xxx系统\n1:注册  2:登入");
        String s = input.nextLine();
        switch (s){
            case "1": {
                System.out.println("请输入你的昵称");
                Scanner n = new Scanner(System.in);
                String name = n.nextLine();
                System.out.println("请输入你的用户名\n用户名只能是手机号或邮箱");

                Scanner un = new Scanner(System.in);
                String username = un.nextLine();
                System.out.println("请输入你的密码\n密码要大于6位小于14位，一定要有大小写字母和数字");
                Scanner pw = new Scanner(System.in);
                String password = pw.nextLine();
                User user = new User(name,username,password);

                if (registerAndLogin.register(user)==true){
                    System.out.println("注册成功\n昵称："+name+"\n用户名："+username);
                }
            }
            case "2":{
                System.out.println("请输入你的用户名");
                Scanner un = new Scanner(System.in);
                String username = un.nextLine();
                System.out.println("请输入你的密码");
                Scanner pw = new Scanner(System.in);
                String password = pw.nextLine();
                User user = new User(username,password);
               if (user!=null) {
                   System.out.println("登入成功\n欢迎" + user + "来到xxx系统" +
                           "\n请输入你需要的服务\n1:查询天气2:查询手机号归属地" +
                           "3:手速游戏4:查询手速游戏前十用户");
                   Scanner s1 = new Scanner(System.in);
                   String skill = s1.nextLine();
                   switch (skill){
                       case "1":{
                           System.out.println("请输入需要查询的城市");
                           Scanner c = new Scanner(System.in);
                           String city = c.nextLine();
                           System.out.println(city+"当前温度:"+GetTodayTemperatureByCity(city));
                       }
                       case "2":{
                           System.out.println("请输入需要查询的手机号");
                           Scanner i = new Scanner(System.in);
                           String phone = i.nextLine();
                           System.out.println(phone+"的归属地为"+GetAddressReportByPhone(phone));
                       }
                       case "3":{

                       }
                       case "4":{}
                   }


               }else {
                   System.out.println("登入失败");
               }


            }
        }


    }
}
