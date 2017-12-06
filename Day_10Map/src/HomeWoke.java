import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HomeWoke {
    public static void main(String [] args){
        Map map= new HashMap();
        map.put("wang","nan");
                for(Object o:   map.keySet() ){
            System.out.println("key的值为："+o+"value的值为:"+map.get(o).toString() );
        }
        for(Object o:   map.values() ){

            System.out.println("value的值为："+o);
        }
        for(Object o : map.entrySet()){
            Map.Entry entry = (Map.Entry) o;
            System.out.println("key的值为："+entry.getKey()
                    +"value的值为："+entry.getValue());

        }


        Iterator iterator =map.entrySet().iterator();

        while (iterator.hasNext()){

            Object next = iterator.next();
             Map.Entry entry = (Map.Entry) next;

            System.out.println(
                    "key为："+entry.getKey()
                            +"value为："+entry.getValue());


        }



    }




}
