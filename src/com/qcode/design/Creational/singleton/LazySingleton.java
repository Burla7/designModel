package com.qcode.design.Creational.singleton;

/**
 * 懒汉模式（延迟加载）
 * 同步关键字防止调用冲突导致实例化不唯一
 * Created by jiaqi,zhang on 2017/8/1.
 */
class LazySingleton {
    /**
     * 被volatile修饰的成员变量可以确保多个线程都能够正确处理
     * volatile关键字会屏蔽Java虚拟机所做的一些代码优化，可能会导致系统运行效率降低
     */
    private  volatile  static LazySingleton instance = null;

    private LazySingleton() { }

    /**
     * 通过双重检查锁定既避免了实例对象不唯一 又解决了系统性能降低的问题
     * @return
     */
    public static LazySingleton getInstance() {
        //第一重判断
        if (instance == null) {
            //锁定代码块
            synchronized (LazySingleton.class) {
                //第二重判断
                if (instance == null) {
                    instance = new LazySingleton(); //创建单例实例
                }
            }
        }
        return instance;
    }
}