

import java.util.Scanner;

public class Day_02��ҵ {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("**************\n***  JAVA  ***\n**************");
		System.out.println("�������ܽ�");
	    int sum = input.nextInt(),a = 0,b=0,c=0,d=0,e=0,f=0,SUM=0;
	    a = sum/100;
	    b=sum%100/50;
	    c=sum%100%50/20;
	    d=sum%100%50%20/10;
	    e=sum%100%50%20%10/5;
	    f=sum%100%50%20%10%5;
	    SUM=a+b+c+d+e+f;
	    System.out.println("100Ԫ"+a+"��\n50Ԫ"+b+"��\n20Ԫ"+c+"��\n10Ԫ"+d+"��\n5Ԫ"+e+"��\n1Ԫ"+f+"��\n��"+SUM+"��");
	    System.out.println("������������");
	    int z = input.nextInt(),q=0;
	    q=z%2;
	    if(q==0) {
	    	System.out.println("ż��");
	    }else {
	    	System.out.println("����");
	    }
	    System.out.println("����������������");
	    int xl= input.nextInt();
	    double w;
	    if(xl<0) {
	    	System.out.println("��������ȷ������������");
	    }
	    else if(xl<=50) {
	    	w=(double) (0.15*xl);
	    }else {
	    	w=(double) (0.15*xl)+(double)(xl%50*0.1);
	    	System.out.println("�����շѣ�"+w);
	    }
	    System.out.println("�����������ݣ�");
	    int year= input.nextInt(),y=0;
	    y=year%400;
	    if(y==0) {
	    	System.out.println(year+"������");
	    }else {
	    	System.out.println(year+"��������");
	    }
	    System.out.println("������һ��������");
	    int fs= input.nextInt(),h=0;
	    h=~fs+1;
	    System.out.println(h);
	}
	
}
