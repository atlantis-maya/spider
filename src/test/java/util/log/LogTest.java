package util.log;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by 朱赫 Email: zhuhe.6@163.com
 * Date:2016/12/20 in 22:59.
 * version:jdk 1.8.
 */
public class LogTest {

    @Test
    public void doLogger(){
        Logger logger = LoggerFactory.getLogger(LogTest.class);
        logger.info("Hello World");
    }

    @Test
    public void doConfigure(){
        LogUtil.logInfo("hello world");


    }
}