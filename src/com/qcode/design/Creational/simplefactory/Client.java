package com.qcode.design.Creational.simplefactory;

/**
 * 客户端类
 * Created by jiaqi,zhang on 2017/9/7.
 */
public class Client {

    public static void main(String args[]) {
        Product product;
        product = Factory.getProduct("A"); //通过工厂类创建产品对象
        product.methodSame();
        product.methodDiff();
    }
}
