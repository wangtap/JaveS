package utils;

import net.sf.json.JSONObject;
import networkdata.PureNetUtil;



public class AddressReportByPhone {

    public static String excute(String phone){
        String url="http://api.k780.com/?app=phone.get&phone="+phone+"&appkey=29836&sign=4fe58a60443a900a251f8b05763d4622&format=json";
        return PureNetUtil.get(url);//通过工具类获取返回数据
    }
    /**
     * 获取返回数据中的一个属性示例,此处以获取今日温度为例
     * "temperature": "8℃~20℃"     今日温度
     * @param args
     * @return
     */
    public static String GetAddressReportByPhone(String phone) {
        String result=excute(phone);
        if(result!=null){
            JSONObject obj=JSONObject.fromObject(result);
            /*获取返回状态码*/
            result=obj.getString("success");
            /*如果状态码是200说明返回数据成功*/
            if(result!=null&&result.equals("1")){
                result=obj.getString("result");
                //此时result中数据有多个key,可以对其key进行遍历,得到对个属性
                obj=JSONObject.fromObject(result);
                //今日温度对应的key是today
                result=obj.getString("att");
//                obj=JSONObject.fromObject(result);
//                //今日温度对应当key是temperature
//                result=obj.getString("temperature");
                return result;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(GetAddressReportByPhone("13027136665"));
    }
}