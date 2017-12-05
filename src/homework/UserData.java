package homework;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class UserData {
	public	 String [][] date={{"张三","zhangSan","111111","Worker"},
	                         {"李四","liSi666","222222","Doctor"},
	                         {"王五","wangWu888","333333","Cooker"},
	                         {"赵六","zhaoLiu999","444444","Boss"}
	                         };
	 static   ArrayList<ArrayList<String>>  list = new ArrayList<ArrayList<String>>();//先定义一个集合对象
	public  void qq (){
		for(int i=0; i<date.length; i++ ){//遍历二维数组，对集合进行填充
			ArrayList<String> listSub=new ArrayList<String>();//初始化一个ArrayList集合
			for(int j=0; j<date[i].length; j++){
				listSub.add(date[i][j]);//数组的列放到集合中
			}
			list.add(listSub);//二维数组放到集合中
		}
	}


//	                 List <String> list = Arrays.asList(date);
















//            List    <String [][]> list =Arrays.asList(date);
//	public String job(String name){
//		String job = null;
//		switch(name){
//		case "zhangSan": job="Worker";break;
//		case "liSi666": job="Doctor";break;
//		case "wangWu888": job="Cooker";break;
//		case "zhaoLiu999": job="Boss";break;
//		}
//
//		return job;
//	}




}