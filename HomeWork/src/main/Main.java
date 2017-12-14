package main;

import org.dom4j.DocumentException;
import utils.RegisterAndLogin;
import bean.User;
import utils.Constants;
import utils.NetTool;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static utils.WeatherReportByCity.GetTodayTemperatureByCity;
import static utils.AddressReportByPhone.GetAddressReportByPhone;

public class Main {
    private static final int TIMES_DIFFICULT = 30;
    private static final int TIMES_MIDDLE = 20;
    private static final int TIMES_EASY = 10;
    private static List<Character> difficult;
    private static List<Character> middle;
    private static List<Character> easy;
    private static Random random;
    private static Scanner input;
    private static NetTool netTool;
    public static void main(String[] args) throws IOException, DocumentException {
        random=new Random();
        input=new Scanner(System.in);
        netTool=new NetTool();
        boolean d = true;
        Scanner input = new Scanner(System.in);
        RegisterAndLogin registerAndLogin = new RegisterAndLogin();
        System.out.println("欢迎来到xxx系统\n1:注册  2:登入");
        String s = input.nextLine();
        initGame();
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
                if (name != null) {
                    System.out.println("登入成功\n欢迎" + name + "来到xxx系统");
                    while (d) {
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
                                        startGame(difficult, TIMES_DIFFICULT,name);break;
                                    }
                                    case "2": {
                                        startGame(middle, TIMES_MIDDLE,name);break;
                                    }
                                    case "3": {
                                        startGame(easy, TIMES_EASY,name);break;
                                    }
                                }
                                break;
                            }
                            case "4": {
                                List<User> users = netTool.pullJsonArray(Constants.URL_TEN, User.class);
                                for (int i = 0; i < users.size(); i++) {
                                    User user1 = users.get(i);
                                    int index = i + 1;
                                    System.out.println("第" + index + "名：\t昵称：" + user1.getNickname() + "\t成绩：" + user1.getScore());
                                }
                                break;
                            }
                            case "5": {
                                d = false;
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

    private static void initGame() {
        difficult = new ArrayList();
        middle = new ArrayList<>();
        easy = new ArrayList<>();
        //32是空格，126是~
        for (char i = 32; i <= 126; i++) {
            difficult.add(i);
        }
        //小写字母
        for (char i = 97; i <= 122; i++) {
            easy.add(i);
        }
        //数字
        for (char i = 48; i <= 57; i++) {
            easy.add(i);
        }
        middle.addAll(easy);
        //数字
        for (char i = 48; i <= 57; i++) {
            middle.add(i);
        }
    }

    public static void startGame(List<Character> cs, int times,String nickname) {
        StringBuilder game = new StringBuilder();
        for (int i = 0; i < times; i++) {
            int index = random.nextInt(cs.size() - 1);
            game.append(cs.get(index));
        }
        for (int i = 3; i >= 0; i--) {
            if (i == 0) {
                System.out.println("游戏开始了：");
            } else {
                System.out.println("倒计时" + i + "秒后开始");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(game);
        long start = System.currentTimeMillis();
//        input.nextLine();
        String receive = input.nextLine();
        if (game.toString().equals(receive)) {
            long end = System.currentTimeMillis();
            long score = end - start;
            Number number = new Long(score);
            int time = number.intValue();
            System.out.println("恭喜您，成绩为：" + time + "毫秒");
            String result = netTool.pushScore(Constants.URL_INSERT, nickname, time);
            if (result.equals("SUCCESS")) {
                System.out.println("成绩提交成功");
            }
            User user = netTool.pullXml(Constants.URL_FIRST, User.class);
            System.out.println("目前第一名为：" + user.getNickname() + "\t成绩为" + user.getScore());
        } else {
            System.out.println("游戏失败");
        }
    }
}
