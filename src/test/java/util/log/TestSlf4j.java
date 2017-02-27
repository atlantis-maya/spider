package util.log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Created by 朱赫 Email: zhuhe.6@163.com
 * Date:2016/12/20 in 23:44.
 * version:jdk 1.8.
 */
public class TestSlf4j {
    public static void main(String[] args) {

        PropertyConfigurator.configure("log4j.properties");
        Logger logger = Logger.getLogger(TestSlf4j.class);
        logger.info("这是配置打印出来的信息");

//        org.slf4j.Logger logger2 = LoggerFactory.getLogger(TestSlf4j.class);
//
//        logger2.info("yes");
//
//        logger2.debug("hello");
//
//        logger2.warn("hello");

    }
}
