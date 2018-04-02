package com.wt.springbootwhj.mapper;

import com.wt.springbootwhj.domain.Order;
import org.apache.ibatis.annotations.*;


import java.util.List;
@Mapper
public interface OrderMapper {
    @Insert("insert into `order`(aname,acount,price,uid,count) values(#{aname},#{acount},#{price},#{uid},#{count})")
    boolean insertOrder(Order order);

    @Select("select * from `order` where uid=#{uid}")
    List<Order> selectOrderByUid(int uid);

    @Delete("delete from `order`where oid=#{oid};")
    boolean delete(int oid);

    @Update("update(`order`) set count=#{count} where oid=#{oid}")
    boolean updataOrder(Order order);
}
