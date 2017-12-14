package work;

import org.dom4j.DocumentException;
import work.RegisterAndLogin.RegisterAndLogin;
import work.tool.*;


import java.io.IOException;
import java.util.Scanner;

import static work.Weather.WeatherReportByCity.GetTodayTemperatureByCity;
import static work.phone.AddressReportByPhone.GetAddressReportByPhone;

public class Main {
    public static void main(String[] args) throws IOException, DocumentException {
        boolean d=true;
        Scanner input = new Scanner(System.in);
        RegisterAndLogin registerAndLogin =new RegisterAndLogin();
            System.out.println("欢迎来到xxx系统\n1:注册  2:登入");
            String s = input.nextLine();
            switch (s) {
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
                    User user = new User(name, username, password);
                    if (registerAndLogin.register(user) == true) {
                        System.out.println("注册成功\n昵称：" + name + "\n用户名：" + username);
                    }
                    break;
                }
                case "2": {
                    System.out.println("请输入你的用户名");
                    Scanner un = new Scanner(System.in);
                    String username = un.nextLine();
                    System.out.println("请输入你的密码");
                    Scanner pw = new Scanner(System.in);
                    String password = pw.nextLine();
                    User user = new User(username, password);
                    String name = registerAndLogin.login(user);
                    if (name!= null) {
                        System.out.println("登入成功\n欢迎" + name + "来到xxx系统" );
                        while (d){
                        System.out.println(("请输入你需要的服务\n1:查询天气2:查询手机号归属地" +
                                "3:手速游戏4:查询手速游戏前十用户5:退出"));
                        Scanner s1 = new Scanner(System.in);
                        String skill = s1.nextLine();
                        switch (skill) {
                            case "1": {
                                System.out.println("请输入需要查询的城市");
                                Scanner c = new Scanner(System.in);
                                String city = c.nextLine();
                                System.out.println(city + "当前温度:" + GetTodayTemperatureByCity(city));
                                break;
                            }
                            case "2": {
                                System.out.println("请输入需要查询的手机号");
                                Scanner i = new Scanner(System.in);
                                String phone = i.nextLine();
                                System.out.println(phone + "的归属地为" + GetAddressReportByPhone(phone));
                                break;
                            }
                            case "3": {
                                System.out.println("请选择游戏难度\n1:困难（30个字符）2:适中（20个字符）3:简单（10个字符）");
                                Scanner choose = new Scanner(System.in);
                                String game = choose.nextLine();
                                switch (game) {
                                    case "1": {
                                    }
                                    case "2": {
                                    }
                                    case "3": {
                                    }
                                }
                                break;
                            }
                            case "4": {
                            }
                            break;
                            case "5": {
                                d=false;
                                break;
                            }
                        }

                        }


                    } else {
                        System.out.println("登入失败");
                    }


                }
            }

        }
   }
