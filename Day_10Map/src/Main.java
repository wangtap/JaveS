import javax.xml.bind.Element;
import java.util.*;



public class Main {
    public static void main (String[] args){
        /*
        Map是什么
        是一个接口
        Map可以存放数据，
        Map存放的数据
        都是键值对的形式
        什么是键值对


         name="张三"；
         age=1；
         gender="男";
         这种一一对应的关系就叫键值对

         */
        List list =new ArrayList();
        list.add("1");
        list.add("2");
//        System.out.println(Arrays.toString(list.toArray()));

        Map map=new HashMap();
        map.put("1","12");
        map.put("2","23");
        map.put("3","34");

        Set set=map.entrySet();
        for (Object o: set){//遍历iter
//            System.out.println(o);
        }

        Map m =new HashMap();
        iterate(map);
        /*
        put方法，向map中添加信息
        括号中接收两个参数
        第一个参数表示Key（键）
        第二个参数表示value（值）
         */
        m.put("name","王五");
        m.put("gender","男");
        m.put("age",11);
        m.put("name","王");



        m.get("name");
//        System.out.println( m.get("name"));
//        iter
        for (Object o : m.keySet()) {
            /*
            m.KeySet将map中所有的Key拿出来
            增强for循环，也叫foreach
            冒号后面接收的是一个集合
            也就是接收了一堆数据
             */
//            System.out.println(m.get(o).toString());

        }
//        System.out.println("遍历map的第二种方式");
        //获得m这个map中所有的键值对
//        放进可这个set集合中
        Set set1 = m.entrySet();

        /*
        Collection 是一个接口、List 和Set 都是Collection的子接口
        我们使用的集合ArrayList只是List的一个实现类
        List：有序（通过角标找元素），可重复
        Set ：无序，不可重复
         */

        for (Object o : set1) {
            Map.Entry entry = (Map.Entry) o;
//            System.out.println("K的值为"+entry.getKey()+"-------value的值为"+entry.getValue());
//            System.out.println(o.getClass().getName());
//            System.out.println(entry.getClass().getName());
                     /*
                     一个Entry的实现类对象，就表示一个键值对
                     可以使用这个对象，获得Key或value
                      */




            }




        }
    private static void iterate(Map map) {
        //迭代器：Iterator

        System.out.println("开始使用迭代器遍历map集合");

        Iterator iterator =
                map.entrySet().iterator();


        while (iterator.hasNext()){
            //如果有下一个，则返回true，进入到while循环


            //获得的对象，是Object类型的
            //父类的引用next，只能使用父类的方法
            //无法使用子类独有的方法
            Object next = iterator.next();

            //所以要把next强转成子类
            Map.Entry entry = (Map.Entry) next;

            System.out.println(
                    "key为："+entry.getKey()
                            +"---value为："+entry.getValue());
        }
    }




}
