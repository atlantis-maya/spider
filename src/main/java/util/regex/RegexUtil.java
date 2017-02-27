package util.regex;

import org.apache.commons.lang3.StringUtils;
import util.log.LogUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 朱赫 Email: zhuhe.6@163.com
 * Date:2017/2/21 in 23:26.
 * version:jdk 1.8.
 * 关于正则表达式工具的
 */
public class RegexUtil {

    private RegexUtil(){
    }


    /**
     * Match groups list by regex list.
     *
     * @param input
     *         the input
     * @param regularExpression
     *         the regular expression
     * @param groups
     *         the groups
     *
     * 根据传入的不同的数组来判断，如果数组为空则表示匹配全部的
     * @return the list
     */
    public static List<String[]> matchGroupsListByRegex(String input, String regularExpression, int  [] groups) {
        List<String[]> listGroups = new ArrayList<String[]>();

        if ( 0 == groups.length){
            return matchGroupsListByRegex(input, regularExpression);
        }
        Matcher result =getMatcher(input, regularExpression);
        if (null != result ){
            while (result.find()){
                String [] temp = new String [groups.length];
                for (int i = 0 ;i< groups.length ;i++){
                    temp[i] = result.group(groups[i]);
                }
                listGroups.add(temp);
            }
        }
        return listGroups;
    }

    /**
     * Match single result by regex string.
     *
     * @param input
     *         the input
     * @param regularExpression
     *         the regular expression
     *在使用这个方法的时候要保证确实可以匹配的到
     *
     * @return the string
     */
    public static String matchSingleResultByRegex(String input, String regularExpression) {
        Matcher result = getMatcher(input, regularExpression);
        String str = "";
        if (null != result){
            while (result.find()) {
                str = result.group();
            }
        }
        return str;
    }

    public static boolean isHaveByRegex(String input, String regularExpression) {
        boolean haveValue = false;
        Matcher result = getMatcher(input, regularExpression);
        if (null != result){
            while (result.find()) {
                haveValue = true;
            }
        }
        return haveValue;
    }

    private static Matcher getMatcher(String input, String regularExpression) {
        if (StringUtils.isEmpty(input) || StringUtils.isEmpty(regularExpression)) {
            LogUtil.logError("正则表达式在处理中传入空值");
            return null;
        }
        Pattern pattern = Pattern.compile(regularExpression);
        return pattern.matcher(input);
    }


    private static List<String[]> matchGroupsListByRegex(String input, String regularExpression) {
        List<String[]> listGroups = new ArrayList<String[]>();
        Matcher result =getMatcher(input, regularExpression);
        if (null != result ){
            while (result.find()){

                /**下面是groupCount的源码返回的是匹配总数减去1
                 * public int groupCount() {
                 *   return parentPattern.capturingGroupCount - 1;
                 *  }
                 */
                
                String [] temp = new String [result.groupCount()+1];
                for (int i = 0 ;i<temp.length ;i++){
                    temp[i] = result.group(i).trim();
                }
                listGroups.add(temp);
            }
        }
        return listGroups;
    }
}
