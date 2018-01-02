package utils;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;
import bean.User;
import tool.Validator;
import utils.JDBC.ExecuteInter;
import utils.JDBC.InsertDeleteUpdateQuery;
import utils.JDBC.JDBCUtil;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RegisterAndLogin {
        private String username=null;
        public void newXML() throws IOException {
                OutputFormat outputFormat = getOutputFormat();
        XMLWriter xmlWriter =new XMLWriter(new FileWriter("src/out1.xml"),outputFormat);
                Document document = DocumentHelper.createDocument();
                document.addElement("users");
                xmlWriter.write(document);
                xmlWriter.close();
        }

        private OutputFormat getOutputFormat() {
                OutputFormat outputFormat =OutputFormat.createPrettyPrint();
                outputFormat.setEncoding("UTF-8");
                return outputFormat;
        }

@Test
        public void text() throws DocumentException, IOException {
                boolean email = Validator.isEmail("sadsadf55@qq.com");
//                System.out.println(email);
                boolean mobile = Validator.isMobile("13027136665");
//                System.out.println(mobile);
                boolean password = Validator.isPassword("1D45f5");
//                System.out.println(password);
                User user = new User("w", "", "123");
//                System.out.println(register(user));

        }
//        public boolean register(User u) throws DocumentException, IOException {
//                boolean a=true;
//                SAXReader saxReader =new SAXReader();
//                Document document = saxReader.read("src/out1.xml");
//                Element root = document.getRootElement();
//                List<Element> users = root.elements();
//                for (int i = 0; i < users.size(); i++) {
//                        Element un = users.get(i).element("username");
////                        Element pw = users.get(i).element("password");
//                        String   username= un.getText();
////                        String password = pw.getText();
//                        if (username.equals(u.getUsername())){
//                                System.out.println("用户名重复");
//                                a=false;
//                                break;
//                        }
//                }
//                if(!(Validator.isMobile(u.getUsername())^Validator.isEmail(u.getUsername()))){
//                        System.out.println("用户名只能是手机号或邮箱");
//                        a=false;
//                }
//                if (Validator.isPassword(u.getPassword())==false){
//                        System.out.println("密码要大于6位小于14位，一定要有大小写字母和数字");
//                        a=false;
//                 }
//                if (a==true) {
//                        Element user = root.addElement("user");
//                        user.addAttribute("name", u.getNickname());
//                        Element username = user.addElement("username");
//                        username.addText(u.getUsername());
//                        Element password = user.addElement("password");
//                        password.addText(u.getPassword());
//                        OutputFormat outputFormat = getOutputFormat();
//                        XMLWriter xmlWriter = new XMLWriter(new FileWriter("src/out1.xml"), outputFormat);
//                        xmlWriter.write(document);
//                        xmlWriter.close();
//                }
//                return a;
//        }
        public boolean register(User u) throws DocumentException, IOException {
                boolean a=true;
                SAXReader saxReader =new SAXReader();
                Document document = saxReader.read("src/out1.xml");
                Element root = document.getRootElement();
                List<Element> users = root.elements();
                for (int i = 0; i < users.size(); i++) {
                        Element un = users.get(i).element("username");
//                        Element pw = users.get(i).element("password");
                        String   username= un.getText();
//                        String password = pw.getText();
                        if (username.equals(u.getUsername())){
                                System.out.println("用户名重复");
                                a=false;
                                break;
                        }
                }
                if(!(Validator.isMobile(u.getUsername())^Validator.isEmail(u.getUsername()))){
                        System.out.println("用户名只能是手机号或邮箱");
                        a=false;
                }
                if (Validator.isPassword(u.getPassword())==false){
                        System.out.println("密码要大于6位小于14位，一定要有大小写字母和数字");
                        a=false;
                 }
                if (a==true) {
                        InsertDeleteUpdateQuery IDUP = new InsertDeleteUpdateQuery();
                        String sql ="INSERT INTO  users VALUES (NULL ,?,?,?)";
                        List<Object> params = new ArrayList<Object>();
                        params.add(u.getUsername());
                        params.add(u.getNickname());
                        params.add(u.getPassword());
                        boolean flag = false;
                        try {
                                flag = IDUP.updateByPreparedStatement(sql, params);
                        } catch (SQLException e) {
                                e.printStackTrace();
                        }
                        System.out.println(flag);

//                        JDBCUtil.execute(new ExecuteInter() {
//                                @Override
//                                public Statement execute1(Connection coon)  throws  SQLException{
//                                       String sql ="INSERT INTO  users VALUES (NULL ,?,?,?)";
//                                        PreparedStatement pstate = coon.prepareStatement(sql);
//
//                                        pstate.setString(1,u.getUsername());
//                                        pstate.setString(2,u.getNickname());
//                                        pstate.setString(3,u.getPassword());
//                                         pstate.executeUpdate();
//                                        return  pstate;
//                                }
//                        });
                }
                return a;
        }

//        public  String login (User u) throws DocumentException {
//                boolean b=false;
//                String name=null;
//                SAXReader saxReader =new SAXReader();
//                Document document = saxReader.read("src/out1.xml");
//                Element root = document.getRootElement();
//                List<Element> users = root.elements();
//                for (int i = 0; i < users.size(); i++) {
//                        Element un = users.get(i).element("username");
//                        Element pw = users.get(i).element("password");
//                        String username = un.getText().toString();
//                        String password = pw.getText().toString();
//                         if (username.equals(u.getUsername())){
//                                if(password.equals(u.getPassword())){
//                                       b=true;
//                                   name = users.get(i).attributeValue("name");
//
//                                }
//                        }
//                }
//               if (b==true){
//                        return name;
//              }else {
//                      System.out.println("用户名或密码错误");
//                      return  null;
//              }
//        }
              public  String login (User u) throws DocumentException {
                      JDBCUtil.execute(new ExecuteInter() {
                              @Override
                              public Statement execute1(Connection coon)  throws  SQLException{
                                      String username1 = u.getUsername();
                                      String password = u.getPassword();
                                      String sql ="SELECT  nickname FROM  users WHERE username=? AND password=?";
                                              PreparedStatement pstate = coon.prepareStatement(sql);
                                      pstate.setString(1,username1);
                                      pstate.setString(2,password);
                                      ResultSet resultSet = pstate.executeQuery();
                                      if (resultSet.next()){
                                      username = resultSet.getString(1);}
                                      return  pstate;
                              }
                      });
                      return username;


//                boolean b=false;
//                String name=null;
//                SAXReader saxReader =new SAXReader();
//                Document document = saxReader.read("src/out1.xml");
//                Element root = document.getRootElement();
//                List<Element> users = root.elements();
//                for (int i = 0; i < users.size(); i++) {
//                        Element un = users.get(i).element("username");
//                        Element pw = users.get(i).element("password");
//                        String username = un.getText().toString();
//                        String password = pw.getText().toString();
//                         if (username.equals(u.getUsername())){
//                                if(password.equals(u.getPassword())){
//                                       b=true;
//                                   name = users.get(i).attributeValue("name");
//
//                                }
//                        }
//                }
//               if (b==true){
//                        return name;
//              }else {
//                      System.out.println("用户名或密码错误");
//                      return  null;
//              }
        }


}
