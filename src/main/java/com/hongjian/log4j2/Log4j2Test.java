package com.hongjian.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * log4j2 日志输出
 *
 */
public class Log4j2Test {
	// 获得日志记录器
	private static final Logger logger = LogManager.getLogger(Log4j2Test.class);
	
    public static void main( String[] args ){
    	// console 打印
        System.out.println( "Console message！" );
        // trace 级别
        logger.trace("Trace message!");
        // debug 级别
        logger.debug("Debug message!");
        // info 级别
        logger.info("Info message!");
        // warn 级别
        logger.warn("Warn message!");
        // error 级别
        logger.error("Error message!");
        // fatal 级别
        logger.fatal("fatal message!");
    }
}
