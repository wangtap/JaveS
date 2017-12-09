package com.lanou3g.study;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io

        .SAXReader;

import javax.print.Doc;
import java.io

        .File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {
    static SAXReader reader = new SAXReader();
    static Document read = null;
    public static void main(String[] args) throws DocumentException {
        read = reader.read(new File("src/date.xml"));

        List<Student> students =
                lisiElements();
        System.out.println(
                Arrays.toString(students.toArray())
        );

//             allElements(read.getRootElement());




    }
    public static void allElements(Element e){
        List<Attribute>attributes=
                e.attributes();
        for (int i = 0; i <attributes.size() ; i++) {
            Attribute attr=
                    attributes.get(i);
            System.out.println("名字"+attr.getName()+"值"+attr.getValue());

        }

        String text = e.getText();
        System.out.println("文本"+text);


        List<Element> elements=
                e.elements();
        //如果没有子标签，则结束这个方法
        if(elements.size()==0){
            return;
        }
        for (int i = 0; i <elements.size() ; i++) {
            //获得第i个子标签
            Element ele=elements.get(i);
            //放入allElements方法
            allElements(ele);

        }




    }

    private static List<Student> lisiElements() throws DocumentException {

        Element rootElement = read.getRootElement();
        List<Element> student = rootElement.elements("student");

        List<Student>studentDate=new ArrayList<>();

        for (int i = 0; i < student.size(); i++) {
            Element element = student.get(i);
            Student stu =new Student();
            Attribute name = element.attribute("name");
            // 获得name属性的值
            String value = name.getValue();
            //设置到sty对象中
            stu.setName(value);
            Element score = element.element("score");

            // 拿到score标签中的文本
            String text = score.getText();
            //"1"____1
            stu.setScore(Integer.parseInt(text));
            //把数据健全去的学生对象，装进集合中
            studentDate.add(stu);

            System.out.println("学生的名为:"+value+"\n学生的分数为:"+text);

        } return studentDate;
    }


}
