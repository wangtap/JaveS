package com.lanou3g.normal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarDemo {

	public static void main(String[] args) {
	Date date =new Date();
//System.out.println(System.currentTimeMillis());
//Date qq =new Date( System.currentTimeMillis());
//System.out.println(qq.getTime());
	long l=System.currentTimeMillis();
//	�������԰������ǽ�����ʱ��ת�������ǿ��Կ��ö����ַ���
	DateFormat df = new  SimpleDateFormat("GG-yyyy-MM-dd  :hh:mm:ss");
	 String time= df.format(System.currentTimeMillis());
     System.out.println(time);
	
	}
	@Override
	public String toString() {
		return super.toString();
	}
}