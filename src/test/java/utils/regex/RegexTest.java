package utils.regex;

import org.junit.Test;
import util.log.LogUtil;
import util.regex.RegexUtil;

import java.util.List;

/**
 * Created by 朱赫 Email: zhuhe.6@163.com
 * Date:2017/2/25 in 15:50.
 * version:jdk 1.8.
 */
public class RegexTest {

    @Test
    public void doSingleRegex() {
        String input = "rrwerqq84461376qqasfdasdfrrwerqq84461377qqasfdasdaa654645aafrrwerqq84461378qqasfdaa654646aaasdfrrwerqq84461379qqasfdasdfrrwerqq84461376qqasfdasdf";
        String regex = "qq(.*?)qq";
        String result = RegexUtil.matchSingleResultByRegex(input, regex);
        LogUtil.logInfo("经过正则表达式匹配后的结果" + result);
    }

    @Test
    public void doSingle() {
        String input = "This order was placed for QT3000! OK?";
        String regex = "This (.*?) was";
        String result = RegexUtil.matchSingleResultByRegex(input, regex);
        LogUtil.logInfo("经过正则表达式匹配后的结果" + result);
    }

    @Test
    public void doValueByRegex() {
        String input = "This order was placed for QT3000! OK?";
        String regex = "orle";
        boolean result = RegexUtil.isHaveByRegex(input, regex);
        LogUtil.logInfo("经过正则表达式匹配后的结果" + result);
    }

    /**
     * 测试这个方法获得了通过
     */
    @Test
    public void doGroupsRegex() {
        String input = "rrwerqq84461376qqasfdasdfrrwerqq84461377qqasfdasdaa654645aafrrwerqq84461378qqasfdaa654646aaasdfrrwerqq84461379qqasfdasdfrrwerqq84461376qqasfdasdf";
        String regex = "qq(.*?)qq";
        int[] groups = {};
        List<String[]> groupsResult = RegexUtil.matchGroupsListByRegex(input, regex, groups);
//        for (int i = 0; i<groupsResult.size(); i++){
//            String [] result = groupsResult.get(i);
//           for (int j=0 ;j< result.length;j++){
//
//           }
//        }
        for (String[] result : groupsResult) {
            for (String temp : result) {
                LogUtil.logInfo(temp);
            }
        }

    }
}
