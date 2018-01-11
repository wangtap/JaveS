package homework.utils;

import java.util.ArrayList;
import java.util.Random;

public class CodeUtil {
     ArrayList arrayList =new ArrayList();
      Random random=new Random();
    StringBuffer stringBuffer=new StringBuffer();
    public void produceRandom(){


        for (char i = 32; i <= 126; i++) {
            stringBuffer.append(i);
            }

        System.out.println(stringBuffer);
    }

}
