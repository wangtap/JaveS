package com.lanou3g.today;
import com.lanou3g.yesterDay.One.Student;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 * �ĵ�ע��
 */
public class Main {
    @Test
        //��ӵ���java�Ĳ��԰�
    // ʹ��������е�@Testע��Ϳ��Ե�������t1�ķ���
  /*
        �ݹ�
        �ݹ�����Լ����Լ�
         */
    public  void t1(){
        practice(1);


    }
    private  int i =0;
     public void show(){
         System.out.println("��"+(++i)+"�ε���");
         if (i<9){ show();}
         System.out.println("��"+i+"�ε��ý���");
    }
    int result=0;
     int j=0;
    public  void add99(){
        j+=1;
        System.out.println(result);
        result=j*j;
        if (j<=9){add99();}

    }
    public void practice(int num){
        for (int k = num; k >=1 ; k--) {
            System.out.println(k+"*"+num+"="+(k*num));
//            System.out.println("\t");
         }
//        System.out.println();
        num++;
        if(num==10){return;}
        practice(num);

    }
    @Test
    public  void t2() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        /*
        ������������ʲô�ģ�
        ������԰�������û�ж���������
        ����ֻ���������£����÷Ǿ�̬�ķ���
        ����˽�з�����������
         */
//        �����
//        Instance ʵ��
//        ���ǳƺ���ͬ��һ��Hero���ʵ��
//        ����һ��Hero�Ķ���
        Object obj = Hero.class.newInstance();
        Hero heres = Hero.class.newInstance();
//        ��������
        Method skill = Hero.class.getMethod("skill");
        skill.invoke(heres);


    }
    @Test
        public void t3(){
//        showName("����");
//        showName("����","����");

        String[] ns={"����1","����1","����1"};
        /*
        ���Ը�����ַ���
        Ҳ���Ը���������
        ���ǲ��ܸ��ַ���������һ���
         */
//        showName(ns);


    }
    public void showName(String... names){
//            �ڷ������У�������names����һ������
//        ���������ΪString
        for (String name : names) {
            System.out.println(name+"\t");
            System.out.println();

        }
    }
    @Test
    public  void t4() throws Exception {
        Student student = Demo.getInstance(Student.class);
        Object o = Demo.getInstance("com.lanou3g.today.Hero");
        System.out.println(o.toString());
    }
}

