package com.lanou3g.yesterDay;

import com.lanou3g.yesterDay.One.DatebassUtil;
import com.lanou3g.yesterDay.One.Student;
import com.lanou3g.yesterDay.One.Teacher;

public class Main {
    public static void main(String[] args) {
        DatebassUtil<Student> dbu=new DatebassUtil<>();
        dbu.save(new Student());
//        dbu.findById();
        DatebassUtil<Teacher> dbu2=new DatebassUtil<>();
        dbu2.save(new Teacher());}

        public static <T> T test(T t ){
          return null;
    }
    public static  <E> E test2(E e ){
            return null;
    }

}

