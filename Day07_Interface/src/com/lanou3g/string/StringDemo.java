package com.lanou3g.string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String a = "abeecedefeaeccece";
		/*
		 * ��ȡ�ַ�������
		 * 
		 */
		System.err.println(a.length());
		//�滻����a�滻��h,ֻ�Ƿ���ֵ�滻�Ľ����������ѽ����ֵ��a
		System.err.println(a.replace("a", "b"));
		//ȡ�ַ����е��Ӵ���0λ�ÿ�ʼ��ȡ��1
		//
//		����һ������ҿ�������
//		[0,2)  ���Ծ��Ǵ�0ȡ��1
		System.err.println(a.substring(0, 2));
		
//		��4��ʼһֱ��ĩβ
		System.err.println(a.substring(4));
		
//		��eΪ�����ָ��ַ�������õ�һ���ַ��������飬(ʡ��ĩβ��e)
		System.err.println(Arrays.toString(a.split("e")));
				
//		ȥ���ַ���ǰ��Ŀո񣬲������a�ı䣬ֻ�Ƿ��ؽ�������������ٰѽ����ֵ��a
		a=a.trim();
				
//		�ж������ַ����������Ƿ����
		System.err.println(a.equals("bcd"));
		
//		�ж������ַ����������Ƿ���Ȳ��Һ��Դ�Сд
		a.equalsIgnoreCase("CB");
		
//		��ȡ��һ���ַ�c��a����ַ����е�λ�ã����������c���򷵻�-1
		int index = a.indexOf('e');
		System.err.println(index);
		
		/*
		 * ��ȡindexλ�õ��ַ�
		 * �����index��ֵһ��Ҫ���ַ��������ڷ��߻ᱨ��
		 */
		a.charAt(index);
//	�Ƿ���a��ͷ������boolean��true��false	
		a.startsWith("a");
//		�Ƿ���a��β 
		a.endsWith("a");
		
//		���ַ���ƴ�ӵ�a����
		a.concat("���Ǻ����ϵ�");
		
//		z�ַ���a�Ƿ����"bcd"������ture����false
		a.contains("bcd");
		
//		���ַ���a�е�Сд��ĸת���ɴ�д
		a.toUpperCase();
		
//		���ַ���a�еĴ�д��ĸת����Сд
		a.toLowerCase();
		
		
//		�õ�a�ַ������ַ�����
		char[] chs=a.toCharArray();
		System.err.println(chs);
		System.out.println(Arrays.toString(chs));

//		���a�ַ������ֽ�����
		
		byte[] bytes = a.getBytes();
		
		String aa = new String(bytes,"utf-8");
		
		System.out.println(aa);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}