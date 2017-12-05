package com.lanou3g.homework;

public class Login  {
	public UserInter login (String [][] arr ,String  str1 , String  str2
			/*,UserData boss,UserData cooker,UserData doctor,UserData worker*/){
		for (int i=0 ;i<arr.length;i++ ){
			for (int j=0;j<arr[i].length;j++){
				if (str1.equals(arr[i][1])&&str2.equals(arr[i][2])){
					switch (arr[i][3]){
					case  "Boss":
						return  new Boss(arr[i][3]);  
					case "Cooker":
						return new Cooker(arr[i][3]);
					case "Doctor":
						return new  Doctor(arr[i][3]);
					case "Worker":
						return new Worker(arr[i][3]) ;
					default: break;
					}
				} 
			}
		}
		return null;
		
	}
	
	
	
	

}
