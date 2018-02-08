package com.lanou.study.user.dao;

import com.lanou.study.user.domain.Classes;
import com.lanou.study.user.domain.ClassesQueryParamber;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ClassesDaoTest {

    private SqlSessionFactory sq;

    @Before
    public void setUp() throws Exception {
        sq = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
    }

    @Test
    public void insert() throws Exception {
        SqlSession sqlSession = sq.openSession();
        ClassesDao classesDao = sqlSession.getMapper(ClassesDao.class);
        classesDao.insertClasses(new Classes("java","女"));
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void forEach() throws Exception {
        SqlSession sqlSession = sq.openSession();
        ClassesDao mapper = sqlSession.getMapper(ClassesDao.class);
        ClassesQueryParamber classesQueryParamber = new ClassesQueryParamber();
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        classesQueryParamber.setClassesIds(integers);
        List<Classes> classes = mapper.queryByForEach(classesQueryParamber);
        System.out.println(classes);
        sqlSession.close();

    }
}