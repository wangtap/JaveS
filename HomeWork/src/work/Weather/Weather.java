package work.Weather;

import net.sf.json.JSONObject;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Weather {
    @Test
    public  void weatherForecast() throws IOException {
        URL url =new URL("http://api.k780.com/?app=phone.get&phone=13800138000&appkey=29836&sign=4fe58a60443a900a251f8b05763d4622&format=json");
        URLConnection conn =url.openConnection();
        InputStream is =conn.getInputStream();
        byte []buff=new byte[1024*1024*10];
        int len = is.read(buff);

        System.out.println(len);
        String result =new String(buff,0,len);
        System.out.println(result);
//        JSONObject jsonObject=JSONObject.fromObject(result);
//        W w =(W)JSONObject.toBean(jsonObject,W.class);
//        W.ResultBean resultBean = new W.ResultBean();
//      System.out.println("id为："+w.ResultBean.);
//        String weather_curr = resultBean.getWeather_curr();
//        System.out.println(weather_curr);


    }

}
