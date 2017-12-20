package com.lanou3g.study;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main7 {
    /*
    事务的四个特性
    原子性
    一致性
    隔离性
    持久性

    ACID
     */
    public static void main(String[] args) {
        JDBCTool.execute(coon -> {

            /*

             */


            PreparedStatement pstate=null;
            try {
                coon.setAutoCommit(false);
               pstate= coon.prepareStatement(
                        "DELETE  FROM  hw_user where uname = ? ");
                pstate.setString(1,"李二狗");
                pstate.execute();
//                Class.forName("  ");
                pstate.setString(1,"lisi");
                pstate.execute();
                coon.commit();

            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {

                try {
                    coon.rollback();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }




        return pstate;

        }) ;
    }

}
