package com.wt.springbootwhj.mapper;

import com.wt.springbootwhj.domain.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CommentMapper {
    @Select("select * from store_comment where store_id=#{id}")
    List<Comment> selectCommentById(int id);
}
