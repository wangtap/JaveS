package com.lanou3g.study;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main4 {
    public static void main(String[] args) throws IOException {
        //创建一个Document对象
        Document document=
                DocumentHelper.createDocument();
        /*
        在document对象中，添加一个元素
        元素的名字是students
        并且，将添加的这个元素
        返回给element这个引用
         */

        Element element = document.addElement("students");
        element.addText("我是学生");
        Element element1 = element.addElement("student");
        element1.addAttribute("name","张三");
//        element1.addText("h哈");
        Element fengShu = element1.addElement("score");
        fengShu.addAttribute("score","100");
//        fengShu.addText("分数");
       OutputFormat outputFormat=OutputFormat.createCompactFormat();
        outputFormat.setEncoding("utf-8");
        XMLWriter xmlWriter=new XMLWriter(new FileWriter("src/output.xml"),outputFormat);
        xmlWriter.write(document);

        //将这个工具关闭，并且把工具中的内容写进目标文件中

        xmlWriter.close();

    }
}
