package com.lanou3g.study;

import java.sql.*;

public class Main5 {
    public static void main(String[] args) {
        /*
        1,PrepareStatement 可以使用动态参数
        Statement只能执行静态sql语句
        2.防止sql注入
        什么是sql注入
         */
        JDBCTool.execute(coon -> {
            try {
                PreparedStatement pstate = coon.prepareStatement(
                        "SELECT *FROM   hw_user WHERE   loc=?  AND age>?   ");
                pstate.setString(1,"北京");
                pstate.setInt(2,20);
                ResultSet rs = pstate.executeQuery();
               JDBCTool.showRS(rs);
                return  pstate;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
        });

//        String user ="zhangsan";
//        String psaaaword ="123";
//        String sql ="select*from user where username="+user+"and assword="+psaaaword;

    }


}
