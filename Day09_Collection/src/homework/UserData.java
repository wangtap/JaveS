package homework;



public class UserData {
//	String[][] data=new String [4][4];
	public	static String [][] date={{"����","zhangSan","111111","Worker"},
	                         {"����","liSi666","222222","Doctor"},
	                         {"����","wangWu888","333333","Cooker"},
	                         {"����","zhaoLiu999","444444","Boss"}
	                         };
	public String job(String name){
		String job = null;
		switch(name){
		case "zhangSan": job="Worker";break;
		case "liSi666": job="Doctor";break;
		case "wangWu888": job="Cooker";break;
		case "zhaoLiu999": job="Boss";break;
		}
		
		return job;
	}

}