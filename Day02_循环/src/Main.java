//import javax.xml.namespace.QName;

public class Main
{
     public static void main(String[] arg)
     {
     int javaScore=60;
    		 if (javaScore >90)
    		 	 System .out.println("成绩优秀");
    		 if (javaScore >=60)
    			 System.out.println("成绩合格");
    		 else
    			 System .out.println("成绩不合格");
    		 if (javaScore <60) 
    			 System.out.println("重修");
    		 //同时成立则执行
    		 //&&：当左侧判断条件不成立时不会判断右侧条件
    		 //&：当左侧判断条件不成立时会判断右侧条件
    		 if (--javaScore >=80&--javaScore <=100)
    			 System .out .println( "进入下一阶段学习");
    		 System .out .println( javaScore);
    		 if(javaScore >60||javaScore <90)
    			 //左右的表达式，只要有一个为true
    			 //那么if判断结果就是ture
    			 //||：如果左侧为ture，则不会判断右侧
    			 //|：不管左侧是什么，都会判断右侧
    			 if(!(javaScore <60))
    				 //！：非！true=false
    				 //!false=true
    				 System.out.println("合格");
    		 int  a =10;
    		 int b=20;
    		 /*定义一个新的变量C
    		 将a的值赋值给c
    		 将b的值赋值给a
    		 将c的值赋值给b*/
    		 //int c=a;a=b;b=c;
    		 System.out.println("a:"+a+"    b:"+b);
    		 //不使用第三方变量，直接使用加减法
    		// a=a+b;System.out.println(a);
    		 //b=a-b;System.out.println(b);
    		// a=a-b;System.out.println(a);
    		 //不使用第三方变量，使用异或^
    		 //一个数异或另一个数两次，结果还是这个数
    		 //5^6^6=5
    		 //异或操作二进制两者不相等则为相等则为0
    		 //也就是不同时为1或0
    		 //System.out.println(1^2);
    		 //11010 ^ 10111=0 1101  13
    		 //0 1101^1 0111=1 1010   26
    		 a=a^b;System.out.println(a);
    		 b=a^b;System.out.println(b);
    		 a=a^b;System.out.println(a);
    		 int  q=99;
    		 if (q>=80&&q<=100)
    			 System.out.println("良好");
    		 if(q>=60&&q<80)
    			 System .out.println("中等");
    		 if(q<60)
    			 System .out .println("差");
    		 //if System .out .println("请输入0~100的数");
    		 int speed =15;
    		 int gender =1;
    		// String sex= "男";
    		 if (speed>10){
    			 System.out.println("进决赛");
    		 }else{
    			 System.out.println("退出");
    		 }
    		 if (gender== 1){
    			 System .out.println("进入男生组");
    		 }else {
    			 System .out.println("进入女生组");
    		 }
    		 
    	 }
}
