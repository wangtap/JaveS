package homework;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class UserData {
	public	 String [][] date={{"����","zhangSan","111111","Worker"},
	                         {"����","liSi666","222222","Doctor"},
	                         {"����","wangWu888","333333","Cooker"},
	                         {"����","zhaoLiu999","444444","Boss"}
	                         };
	 static   ArrayList<ArrayList<String>>  list = new ArrayList<ArrayList<String>>();//�ȶ���һ�����϶���
	public  void qq (){
		for(int i=0; i<date.length; i++ ){//������ά���飬�Լ��Ͻ������
			ArrayList<String> listSub=new ArrayList<String>();//��ʼ��һ��ArrayList����
			for(int j=0; j<date[i].length; j++){
				listSub.add(date[i][j]);//������зŵ�������
			}
			list.add(listSub);//��ά����ŵ�������
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