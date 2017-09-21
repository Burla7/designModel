package com.qcode.design.Creational.simplefactory;

/**
 * 抽象产品类
 * Created by jiaqi,zhang on 2017/9/7.
 */
abstract class Product {
    //所有产品类的公共业务方法
    public void methodSame() {
        System.out.println("公共方法");
        //公共方法的实现
    }

    //声明抽象业务方法
    public abstract void methodDiff();

    //静态工厂方法
    public static Product getProduct(String arg) {
        Product product = null;
        if (arg.equalsIgnoreCase("A")) {
            product = new ConcreteProductA();
            //初始化设置product你
        }
        else if (arg.equalsIgnoreCase("B")) {
            product = new ConcreteProductB();
            //初始化设置product
        }
        return product;
    }
}