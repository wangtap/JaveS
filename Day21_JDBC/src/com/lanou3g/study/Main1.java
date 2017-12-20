package com.lanou3g.study;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class Main1 {
    /*
    JDBC全程：
    Java Databases Connection
     java对数据库的连接规范

     mysql-connector-java-5.1.18-bin.jar
     这个jar包，我们叫它驱动
     JDBC是规范，那么不同的数据库厂商可以对该规范有不同 的实现

     所以使用不同的数据库 的时候
     只需要更换不同的jar包即可

     */
    public static void main(String[] args) throws SQLException {
        //1.注册驱动
        DriverManager.registerDriver(new Driver());

        //2.获得连接
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/day19_1", "root", ""
        );

//        System.out.println(connection.getClass().getName());
        //3.找个对象给我们干活
        //声明：statement
        //这个接口，用来声明要执行的sql语句

        String sql = "select*from hw_user";
        Statement statement = connection.createStatement();

        //4.让这个对象去执行sql语句
//        执行查询语句时，得到返回值的类型为  ResultSet  结果集
        ResultSet resultSet = statement.executeQuery(sql);

        //5.从ResultSet 中取出数据
        while (resultSet.next()) {
            System.out.print(resultSet.getInt(1) + "\t");
            System.out.print(resultSet.getString(2) + "\t");
            System.out.print(resultSet.getString(3) + "\t");
            System.out.print(resultSet.getString(4) + "\t");
            System.out.println();

        }

//        6.关闭资源
        resultSet.close();
        statement.close();
        connection.close();


        ResultSet resultSet1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/day19_1", "root", "").createStatement().executeQuery("select*from  book");
//        while (resultSet1.next()) {
//            System.out.print(resultSet1.getString("bkname")+"\t");

//            System.out.println(resultSet1.relative(1));
//        System.out.println(resultSet1.absolute(1));
//        resultSet1.setFetchSize(1).



        System.out.println();

//        }

    }
}
