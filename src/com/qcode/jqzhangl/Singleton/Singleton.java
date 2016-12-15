package com.qcode.jqzhangl.Singleton;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/11/28.

 */
public final class Singleton implements Serializable {

    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static Singleton instance = null;

    /* 私有构造方法，防止被实例化 */
    private Singleton() {
    }

    /* 静态工程方法，创建实例   多线程不安全 */
    public static Singleton getInteraface() {
        if (instance == null) {
            return new Singleton();
        }
        return instance;
    }

    /* 静态工程方法，创建实例  多线程安全  */
    public static Singleton getInterafaceForSynchronous() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) return new Singleton();
            }
        }
        return instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return instance;
    }
}
