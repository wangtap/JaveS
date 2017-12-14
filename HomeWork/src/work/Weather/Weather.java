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
        URL url =new URL("http://v.juhe.cn/weather/index?format=2&cityname=%E6%AD%A6%E6%B1%89&key=3c5c839d9f73f6217e504371e9611120");
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
