package util.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by 朱赫 Email: zhuhe.6@163.com
 * Date:2016/12/20 in 23:04.
 * version:jdk 1.8.
 * 这个类是官网上的教程，需要好好看看
 */

public class Wombat {
    final Logger logger = LoggerFactory.getLogger(Wombat.class);
    Integer t;
    Integer oldT;
            public void setTemperature(Integer temperature) {

             oldT = t;
             t = temperature;

             logger.debug("Temperature set to {}. Old temperature was {}.", t, oldT);

            if(temperature.intValue() > 50) {
                   logger.info("Temperature has risen above 50 degrees.");
                 }
           }
 }