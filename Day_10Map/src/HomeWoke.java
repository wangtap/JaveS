import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HomeWoke {
    public static void main(String [] args){
        Map map= new HashMap();
        map.put("wang","nan");
                for(Object o:   map.keySet() ){
            System.out.println("key��ֵΪ��"+o+"value��ֵΪ:"+map.get(o).toString() );
        }
        for(Object o:   map.values() ){

            System.out.println("value��ֵΪ��"+o);
        }
        for(Object o : map.entrySet()){
            Map.Entry entry = (Map.Entry) o;
            System.out.println("key��ֵΪ��"+entry.getKey()
                    +"value��ֵΪ��"+entry.getValue());

        }


        Iterator iterator =map.entrySet().iterator();

        while (iterator.hasNext()){
                         Map.Entry entry = (Map.Entry)  iterator.next();
            System.out.println(
                    "keyΪ��"+entry.getKey()
                            +"valueΪ��"+entry.getValue());


        }



    }




}
