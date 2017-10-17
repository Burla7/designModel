package com.qcode.design.Creational.factory;

import com.qcode.design.Creational.factory.loggerfactory.FileLoggerFactory;
import com.qcode.design.Creational.factory.loggerfactory.Logger;
import com.qcode.design.Creational.factory.loggerfactory.LoggerFactory;

/**
 * Created by jiaqi,zhang on 2017/9/25.
 */
public class Client {

    public static void main(String[] args) {


        // 可以通过配置文件来存储具体工厂类ConcreteFactory的类名，更换新的具体工厂时无须修改源代码，系统扩展更为方便。
        LoggerFactory factory;
        Logger logger;
        factory = new FileLoggerFactory(); //可引入配置文件实现
        //logger = factory.writeLog();
          //  logger.writeLog();

        factory.writeLog();//业务方法中

    }
}
