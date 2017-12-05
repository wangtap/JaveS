

import java.util.Scanner;

public class Day_02作业 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("**************\n***  JAVA  ***\n**************");
		System.out.println("请输入总金额：");
	    int sum = input.nextInt(),a = 0,b=0,c=0,d=0,e=0,f=0,SUM=0;
	    a = sum/100;
	    b=sum%100/50;
	    c=sum%100%50/20;
	    d=sum%100%50%20/10;
	    e=sum%100%50%20%10/5;
	    f=sum%100%50%20%10%5;
	    SUM=a+b+c+d+e+f;
	    System.out.println("100元"+a+"张\n50元"+b+"张\n20元"+c+"张\n10元"+d+"张\n5元"+e+"张\n1元"+f+"张\n共"+SUM+"张");
	    System.out.println("请输入整数：");
	    int z = input.nextInt(),q=0;
	    q=z%2;
	    if(q==0) {
	    	System.out.println("偶数");
	    }else {
	    	System.out.println("奇数");
	    }
	    System.out.println("请输入行李重量：");
	    int xl= input.nextInt();
	    double w;
	    if(xl<0) {
	    	System.out.println("请输入正确的行李重量：");
	    }
	    else if(xl<=50) {
	    	w=(double) (0.15*xl);
	    }else {
	    	w=(double) (0.15*xl)+(double)(xl%50*0.1);
	    	System.out.println("行李收费："+w);
	    }
	    System.out.println("请输入给定年份：");
	    int year= input.nextInt(),y=0;
	    y=year%400;
	    if(y==0) {
	    	System.out.println(year+"是闰年");
	    }else {
	    	System.out.println(year+"不是闰年");
	    }
	    System.out.println("请输入一个负数：");
	    int fs= input.nextInt(),h=0;
	    h=~fs+1;
	    System.out.println(h);
	}
	
}
