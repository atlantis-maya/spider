package util.gson;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by 朱赫 Email: zhuhe.6@163.com
 * Date:2016/12/18 in 20:18.
 * version:jdk 1.8.
 */
public class GsonUtil {

    public static Gson getGson() {
        return new Gson();
    }

    /**
     * 将json格式的字符串转换为jsonObject对象
     * @param json
     * @return
     */
    public static JsonObject parseObject(String json) {
        if (StringUtils.isEmpty(json)) {
            return null;
        }
        return new JsonParser().parse(json).getAsJsonObject();
    }

    /**
     * 将java对象转换为json字符串
     * @param object
     * @return
     */
    public static String jsonString(JsonObject object) {
        if (object == null) {
            return null;
        }
        return getGson().toJson(object);
    }

    //在实际的项目中发现有的时候后返回的值是完全的jsonArray类型的,然后就先当作JsonElement来处理,之后再转化为JsonObject
    public static JsonObject elementParseObject(JsonElement jsonElement) {
        if (jsonElement == null) {
            return null;
        }
        return jsonElement.getAsJsonObject();

    }
    
}
