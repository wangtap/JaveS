package util;

public class ELUtil {
    public static  String reverse(String string){
        if(string==null||string.length()==0)return string;
        int length = string.length();
        char [] array = string.toCharArray();
        for(int i = 0;i<length;i++){
            array[i] = string.charAt(length-1-i);
        }
        return new String(array);

    }

}
