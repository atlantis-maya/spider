package util.http;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 朱赫 Email: zhuhe.6@163.com
 * Date:2016/12/18 in 20:45.
 * version:jdk 1.8.
 */

public class HttpUtil {

    private  HttpClient getHttpClient() {
        return HttpClients.createDefault();
    }

    public  String getMethod(String url) {
        HttpGet get = new HttpGet(url);
        try {
            HttpResponse response = getHttpClient().execute(get);
            HttpEntity entity = response.getEntity();
            return EntityUtils.toString(entity, "UTF-8");
        } catch (Exception e) {
             return null;
        }
    }

    public  String postMethod(Map<String, String> requestParam) {

        List<BasicNameValuePair> parameter = new ArrayList<BasicNameValuePair>();
        /**
         * 这里应该怎么填东西我还没有想好
         */

        HttpPost post = new HttpPost(getUrl());

        try {
            HttpResponse response = getHttpClient().execute(post);
            HttpEntity entity=response.getEntity();
            return EntityUtils.toString(entity,"utf-8");
        } catch (Exception e) {
            return null;

        }
    }

    //下面这个方法可以实现复用可以让子类override
    public  String getUrl() {

        return null;
    }

    //这个方法用来提供请求的参数的
    public Map<String,String> requestParam(){

        Map<String,String>param=new HashMap<String, String>();

        return param;
    }

    //通过这个来判断请求的方法类型,根据不同的方法类型来调用不同的请求方法
    public boolean isPost(){
        return false;
    }
    //这里还需要一个方法来执行请求方法
    /***
     *HashMap map;
     Iterator i = map.entrySet().iterator();
     while (i.hasNext()) {
     Object obj = i.next();
     String key = obj.toString();
     }
     // or
     while (i.hasNext()) {
     Entry entry = (java.util.Map.Entry)it.next();
     entry.getkey();
     entry.getValue();
     }
     *
     *
     */

}
