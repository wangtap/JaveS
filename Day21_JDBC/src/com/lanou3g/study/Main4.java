package com.lanou3g.study;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.lanou3g.study.JDBCTool.init;

public class Main4 {
    public static void main(String[] args) {
        /*


        //调用JDBCTool类时，该类会加载进内存
        //也就执行静态代码块，获得配置文件的数据
//        执行  静态方法execute
        传入的的是ExecuteInter接口的一个匿名实现类对象
        与线程相似
        传进 的对象，我们先交它e
        在execute方法中
        第一步根据配置文件的数据连接
        第二步调用e的execute的方法。将连接传入
        这里就会回来执行这个匿名实现类
        在这个方法中我们获得state，执行sql语句
        并且将stste作为返回值返回
        三，将e.execute1（）得到的返回值关闭
        四 关闭连接

        方法叫接口回调
                */

        ExecuteInter executeInter = new ExecuteInter() {
            @Override
            public Statement execute1(Connection connection) {
                System.out.println( "1");
                return null;
            }
        };





        JDBCTool.execute(new ExecuteInter() {
           @Override
           public Statement execute1(Connection coon)  throws  SQLException{
                   Statement statement = coon.createStatement();
                   String sql ="select*from hw_user";
                   ResultSet rs = statement.executeQuery(sql);
//                  JDBCTool.showRS(rs);
                   return  statement;
           }
       });



    }
}
