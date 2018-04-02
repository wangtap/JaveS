package com.wt.springbootwhj.mapper;

import com.wt.springbootwhj.domain.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface ArticleMapper {
    //查询所有商品信息
    @Select("select * from article")
    List<Article> select();
    //按limit查询，显示指定的数据
    @Select("select * from article limit #{page},#{PAGE_SIZE}")
    List<Article> selectHot(@Param("page") int page, @Param("PAGE_SIZE") int PAGE_SIZE);

    @Select("select * from article where goods_id=#{id}")
    Article selectArticeById(int id);

    @Select("select * from article where type=#{type}")
    List<Article> selectArticeType(int type);
}
