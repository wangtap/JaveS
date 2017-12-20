package com.lanou3g.study;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Main3 {
    public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/day19_1";
        Properties info=new Properties();
        info.load(new FileReader("src/jdbc.properties"));
        Connection conn = DriverManager.getConnection(url, info);

        Statement statement = conn.createStatement();

        String update= "update hw_user set uname='李二狗' "+"where uname='张一山' ";
        boolean execute = statement.execute(update);
        statement.close();
        conn.close();
        System.out.println(execute);


    }





}
