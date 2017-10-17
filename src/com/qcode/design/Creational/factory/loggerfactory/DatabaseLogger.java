package com.qcode.design.Creational.factory.loggerfactory;

/**
 *
 * 数据库日志记录器：具体产品
 * Created by jiaqi,zhang on 2017/9/25.
 */
public class DatabaseLogger implements Logger {
    public void writeLog() {
        System.out.println("数据库日志记录。");
    }


}