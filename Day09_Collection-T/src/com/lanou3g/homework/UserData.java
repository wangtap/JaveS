package com.lanou3g.homework;

import com.lanou3g.homework.exception.LoginException;
import com.lanou3g.homework.exception.RegisterException;
import com.lanou3g.homework.exception.UsernameExistsException;
import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zyf on 2017/12/5.
 */
public class UserData {

	public static List<Person> users
			= new ArrayList<>();
	static Document document = null;
	//String：key的类型：我们用来装用户名
	//Person：value的类型：我们用来装一个用户对象
	public static Map<String,Person> userMap
			= new HashMap<>();
	public void xmlAdd(Person person) throws DocumentException, IOException, UsernameExistsException {
		OutputFormat format =
				OutputFormat.createPrettyPrint();
		document =
				new SAXReader().read(new File("src/output.xml"));
		Element root =
				document.getRootElement();
		List<Element> elements = root.elements();
		try {
			  int a=0;
		for (int i = 0; i <elements.size() ; i++) {
			List<Element> elements1 = elements.get(i).elements();
			if(person.getUsername().equals(elements1.get(0).getText())){
				XMLWriter writer = new XMLWriter(new FileWriter(
						"src/output.xml"),format);
				writer.write(document);
				writer.close();
				a=1;
//				System.out.println(person.getUsername()+"---"+a+(elements1.get(0).getText()));
					throw  	new UsernameExistsException();
			}
		}
			if (a==0){
		Element student = root.addElement("person");
		student.addAttribute("name",person.getName());
		Element username = student.addElement("username");
		username.addText(person.getUsername());
		Element password = student.addElement("password");
		password.addText(person.getPassword());
		Element job = student.addElement("job");
		job.addText(person.getJob());
		XMLWriter writer = new XMLWriter(new FileWriter("src/output.xml"),format);
		writer.write(document);
		writer.close();
		System.out.println("注册成功了");

		          }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	 static void  xml() throws IOException, DocumentException {
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

}
