package com.qcode.design.Creational.factory.loggerfactory;

/**
 * 文件日志记录器：具体产品
 * Created by jiaqi,zhang on 2017/9/25.
 */

public class FileLogger implements Logger {
    public void writeLog() {
        System.out.println("文件日志记录。");
    }

}