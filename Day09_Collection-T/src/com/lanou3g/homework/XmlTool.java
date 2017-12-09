package com.lanou3g.homework;
import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class XmlTool {
    public XmlTool() throws IOException, DocumentException {
        xml();
    }

    static SAXReader reader = new SAXReader();
       static Document document = null;
    public  void  xml() throws IOException, DocumentException {
        Document document =
                DocumentHelper.createDocument();
        Element element =
                document.addElement("users");
        Element student =
                element.addElement("person");
        student.addAttribute("name","");
        student.addElement("username");
        student.addElement("password");
        student.addElement("job");
        OutputFormat outputFormat =
                OutputFormat.createPrettyPrint();
        outputFormat.setEncoding("UTF-8");
        XMLWriter xmlWriter =
                new XMLWriter(new FileWriter(
                        "src/output.xml"),outputFormat);
        xmlWriter.write(document);
        xmlWriter.close();
    }
    public void xmlAdd(Person person) throws DocumentException, IOException {
                  document =
                reader.read(new File("src/output.xml"));
        Element root =
                document.getRootElement();
        Element student = root.addElement("person");
        student.addAttribute("name",person.getName());
        Element username = student.addElement("username");
        username.addText(person.getUsername());
        Element password = student.addElement("password");
        password.addText(person.getPassword());
        Element job = student.addElement("job");
        job.addText(person.getJob());
        OutputFormat format =
                OutputFormat.createPrettyPrint();
        XMLWriter writer = new XMLWriter(new FileWriter(
                "src/output.xml"),format);
        writer.write(document);
        writer.close();
    }
}
