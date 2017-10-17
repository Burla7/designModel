package com.qcode.design.Creational.factory.loggerfactory;

/**
 * 日志记录器工厂接口：抽象工厂
 * Created by jiaqi,zhang on 2017/9/25.
 */
public abstract class LoggerFactory {
    //在工厂类中直接调用日志记录器类的业务方法writeLog()
    public void writeLog() {
        //此时，在工厂类中将直接调用产品类的业务方法，客户端无须调用工厂方法创建产品，直接通过工厂即可使用所创建的对象中的业务方法。（隐藏工厂方法）
        Logger logger = this.createLogger();
        logger.writeLog();
    }

    /**
     *隐藏工厂方法
     * @return
     */
    public abstract Logger createLogger();
}
