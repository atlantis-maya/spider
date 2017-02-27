package utils.gson;


import com.google.gson.JsonObject;
import org.junit.Test;
import util.gson.GsonUtil;

/**
 * Created by 朱赫 Email: zhuhe.6@163.com
 * Date:2016/12/19 in 23:38.
 * version:jdk 1.8
 */
public class GsonTest {

    @Test
    public void doGsonUtil(){
        String json="{\"result\":\"success\",\"number\":5245}";
        JsonObject object = GsonUtil.parseObject(json);
        System.out.println(object.get("result").getAsString());
    }
}
