package util.log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


/**
 * Created by 朱赫 Email: zhuhe.6@163.com
 * Date:2016/12/19 in 23:48.
 * version:jdk 1.8.
 *
 * 这个类是用来打印日志的工具类
 */
public class LogUtil {

    private static Logger logger = Logger.getLogger(LogUtil.class);

    public static void logInfo(String infoString) {
        /**
         * 打印正常的日志信息
         */
        PropertyConfigurator.configure("log4j.properties");
        logger.info(infoString);

    }
    public static void logError(String errorString){
        /**
         * 打印错误的日志信息
         */
        PropertyConfigurator.configure("log4j.properties");
        logger.error(errorString);
    }


}
