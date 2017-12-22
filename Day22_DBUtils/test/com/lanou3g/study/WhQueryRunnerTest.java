package com.lanou3g.study;

import com.lanou3g.utils.JDBCTool;
import org.apache.commons.dbutils.handlers.*;
import org.junit.Test;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class WhQueryRunnerTest {
    /*
    根据需求结果的类型，
    选择ResultSetHandler的实现类
    如果结果集为单行单列：ScalarHandler
    如果想要一个对象：BeanListHandler
    如果想要一个Map：MapHandler
    如果想要一个Map集合：MapListHandler
    如果想要一个数组：ArrayHandler
    如果想要一个数组的集合:ArrayListHandler
    */
    @Test
    public  void  queryByParams() throws SQLException {
       Long query = new WhQueryRunner().query(
                JDBCTool.init(),
                "select count(*) from hw_user ",
                new ScalarHandler<Long>()
//                "无敌"
        );

       /*
       Number类
       可以接受任何数值类型的值
       Number类中有获取各种整形值的方法
        */
       Number number =query;
       //获得int值
        int i = number.intValue();
        System.out.println(i);
        System.out.println(query);
//        for (Object[] objects : query) {
//            System.out.println(query);
//        }
    }
@Test
    public  void queryBean() throws SQLException {
    List<User> users = new WhQueryRunner().query(
            JDBCTool.init(),
            "select*from hw_user",
            new BeanListHandler<User>(User.class)
    );
    System.out.println(users);
    }
    @Test
    public  void queryMap() throws SQLException {
        Map<String, Object> query = new WhQueryRunner().query(
                JDBCTool.init(),
                "select*from hw_user",
                new MapHandler()
        );
        System.out.println(query.toString());
    }@Test
    public  void queryListMap() throws SQLException {
        List<Map<String, Object>> query = new WhQueryRunner().query(
                JDBCTool.init(),
                "select*from hw_user",
                new MapListHandler()
        );
//        for (Map<String, Object> stringObjectMap : query) {
        System.out.println(query.toString());
//        }
    }


}