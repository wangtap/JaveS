package com.lanou3g.homework;

import com.lanou3g.homework.exception.*;
import com.lanou3g.homework.util.PasswordCheckTool;
import org.dom4j.*;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zyf on 2017/12/5.
 */
public class UserOperate {

	public static Person login (String username,String password) throws LoginException, DocumentException {
				SAXReader reader = new SAXReader();
				int a =0;
		try {
			UserData.document =
					new SAXReader().read(new File("src/output.xml"));

			Element root = UserData.document.getRootElement();
			List<Element> eles = root.elements();
//			System.out.println(eles.get(1).getStringValue());
			for (int i = 0; i < eles.size(); i++) {
//				System.out.println(i);
//				System.out.println(eles.get(i).getStringValue());
//				List <Element> person= eles.();
				List<Element> person = eles.get(i).elements();
//				System.out.println(eles.get(i).element("username"+username));
				String uN = person.get(0).getText();
				String pW = person.get(1).getText();
//				System.out.println(uN+"----"+pW);
				if(uN.equals(username)&&pW.equals(password)){
					System.out.println("登入成功");
					a++;
				}
//

			} if (a==0){throw  new PasswordNotMatchedException();}
		} catch (DocumentException e) {
			throw new RuntimeException("文件未找到");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}


	private static void listRegister(Person person) throws UsernameExistsException {
		for(Person p : UserData.users){
			if(p.equals(person)){
				//说明，在users集合中，存在一个p
				//它的用户名与参数person相同
				//抛出一个用户名已存在异常
				throw new UsernameExistsException();
			}
		}
		UserData.users.add(person);
	}
	public static void register(Person person) throws RegisterException{

		//listRegister(person);

		Person p =
				UserData.userMap.get(person.getUsername());

		if(p != null){
			throw new UsernameExistsException();
		}

		if(PasswordCheckTool.isNotEasy(person.getPassword())){
			UserData.userMap.put(person.getUsername(),person);
		}





	}
}
