package com.lanou3g.study;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main6 {
    public static void main(String[] args) {
        JDBCTool.execute(coon -> {
            //{}就是匿名内部类实现ExecuteInter接口时
            //复写的那个方法execute的方法体
            //conn就是execute方法的参数
            //
            try {
                PreparedStatement pstate = coon.prepareStatement("INSERT INTO  hw_user VALUE" +
                        "  (NULL ,'zhangSan',30,'上海')");
                //将30岁的张三加入到批处理中
                pstate.addBatch();

                //添加批处理任务
                pstate.addBatch("INSERT INTO  hw_user VALUE" +
                        "  (NULL ,'liSi',10,'武汉')");
                pstate.addBatch("INSERT INTO  hw_user VALUE" +
                        "  (NULL ,'张三',11,'武汉')");
                //开始执行
                pstate.executeBatch();




                return  pstate;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;


        });
    }
}
