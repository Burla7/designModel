package com.qcode.design.Creational.simplefactory;

/**
 * 抽象产品类
 * Created by jiaqi,zhang on 2017/9/7.
 */
abstract class Product {
    //所有产品类的公共业务方法
    public void methodSame() {
        //公共方法的实现
    }

    //声明抽象业务方法
    public abstract void methodDiff();
}