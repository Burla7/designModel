package com.qcode.jqzhangl.Singleton;

import java.io.Serializable;

/**
 *  饥汉式单例(非延迟加载)
 * Created by Administrator on 2016/11/28.
 */
public final class SingletonInit implements Serializable {

    /* 持有私有静态实例，防止被引用，无法实现延迟加载 */
    private static SingletonInit instance =  new SingletonInit();

    /* 私有构造方法，防止被实例化 */
    private SingletonInit() {
    }


    /* 静态工程方法，创建实例  多线程安全  */
    public static SingletonInit getInteraface() {
        return instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return instance;
    }

}
