package com.lanou3g.study;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;

public class Main {
    public static void main(String[] args) throws DocumentException {
        //?????????????.xml??????java???????????????????
        SAXReader saxReader = new SAXReader();
                    //File?????
        //?????е?????????????????????????????
        Document document = saxReader.read(new File("src/date.xml"));
        //????????????
        //????date.xml?е?<students>???
        Element root = document.getRootElement();
        //???<students>?е?<student>???
        Element student = root.element("student");
        //???<student>??????name????
        Attribute name = student.attribute("name");
        //???name??????
        String value = name.getValue();
        System.out.println(value);
        System.out.println(document.getRootElement()
                .element("student").attribute("name").getValue());


    }
}
