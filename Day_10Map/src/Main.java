import javax.xml.bind.Element;
import java.util.*;



public class Main {
    public static void main (String[] args){
        /*
        Map��ʲô
        ��һ���ӿ�
        Map���Դ�����ݣ�
        Map��ŵ�����
        ���Ǽ�ֵ�Ե���ʽ
        ʲô�Ǽ�ֵ��


         name="����"��
         age=1��
         gender="��";
         ����һһ��Ӧ�Ĺ�ϵ�ͽм�ֵ��

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
        for (Object o: set){//����iter
//            System.out.println(o);
        }

        Map m =new HashMap();
        iterate(map);
        /*
        put��������map�������Ϣ
        �����н�����������
        ��һ��������ʾKey������
        �ڶ���������ʾvalue��ֵ��
         */
        m.put("name","����");
        m.put("gender","��");
        m.put("age",11);
        m.put("name","��");



        m.get("name");
//        System.out.println( m.get("name"));
//        iter
        for (Object o : m.keySet()) {
            /*
            m.KeySet��map�����е�Key�ó���
            ��ǿforѭ����Ҳ��foreach
            ð�ź�����յ���һ������
            Ҳ���ǽ�����һ������
             */
//            System.out.println(m.get(o).toString());

        }
//        System.out.println("����map�ĵڶ��ַ�ʽ");
        //���m���map�����еļ�ֵ��
//        �Ž������set������
        Set set1 = m.entrySet();

        /*
        Collection ��һ���ӿڡ�List ��Set ����Collection���ӽӿ�
        ����ʹ�õļ���ArrayListֻ��List��һ��ʵ����
        List������ͨ���Ǳ���Ԫ�أ������ظ�
        Set �����򣬲����ظ�
         */

        for (Object o : set1) {
            Map.Entry entry = (Map.Entry) o;
//            System.out.println("K��ֵΪ"+entry.getKey()+"-------value��ֵΪ"+entry.getValue());
//            System.out.println(o.getClass().getName());
//            System.out.println(entry.getClass().getName());
                     /*
                     һ��Entry��ʵ������󣬾ͱ�ʾһ����ֵ��
                     ����ʹ��������󣬻��Key��value
                      */




            }




        }
    private static void iterate(Map map) {
        //��������Iterator

        System.out.println("��ʼʹ�õ���������map����");

        Iterator iterator =
                map.entrySet().iterator();


        while (iterator.hasNext()){
            //�������һ�����򷵻�true�����뵽whileѭ��


            //��õĶ�����Object���͵�
            //���������next��ֻ��ʹ�ø���ķ���
            //�޷�ʹ��������еķ���
            Object next = iterator.next();

            //����Ҫ��nextǿת������
            Map.Entry entry = (Map.Entry) next;

            System.out.println(
                    "keyΪ��"+entry.getKey()
                            +"---valueΪ��"+entry.getValue());
        }
    }




}
