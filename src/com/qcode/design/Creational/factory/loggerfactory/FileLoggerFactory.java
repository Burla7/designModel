package com.qcode.design.Creational.factory.loggerfactory;

/**
 * 文件日志记录器工厂类：具体工厂
 * Created by jiaqi,zhang on 2017/9/25.
 */

public class FileLoggerFactory extends LoggerFactory {
    public Logger createLogger() {
        //创建文件日志记录器对象
        Logger logger = new FileLogger();
        //创建文件，代码省略
        return logger;
    }
}