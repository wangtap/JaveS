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
//	这个类可以帮助我们将毫秒时间转换成我们可以看得懂的字符串
	DateFormat df = new  SimpleDateFormat("GG-yyyy-MM-dd  :hh:mm:ss");
	 String time= df.format(System.currentTimeMillis());
     System.out.println(time);
	
	}
	@Override
	public String toString() {
		return super.toString();
	}
}
