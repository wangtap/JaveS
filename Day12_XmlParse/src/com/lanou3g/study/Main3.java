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
            System.out.println("����"+attr.getName()+"ֵ"+attr.getValue());

        }

        String text = e.getText();
        System.out.println("�ı�"+text);


        List<Element> elements=
                e.elements();
        //���û���ӱ�ǩ��������������
        if(elements.size()==0){
            return;
        }
        for (int i = 0; i <elements.size() ; i++) {
            //��õ�i���ӱ�ǩ
            Element ele=elements.get(i);
            //����allElements����
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
            // ���name���Ե�ֵ
            String value = name.getValue();
            //���õ�sty������
            stu.setName(value);
            Element score = element.element("score");

            // �õ�score��ǩ�е��ı�
            String text = score.getText();
            //"1"____1
            stu.setScore(Integer.parseInt(text));
            //�����ݽ�ȫȥ��ѧ������װ��������
            studentDate.add(stu);

            System.out.println("ѧ������Ϊ:"+value+"\nѧ���ķ���Ϊ:"+text);

        } return studentDate;
    }


}
