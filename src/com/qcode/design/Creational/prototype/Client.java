package com.qcode.design.Creational.prototype;

/**
 * Created by jiaqi,zhang on 2017/8/14.
 */
public class Client {

    public static void main(String[] args) {



        Prototype prototype = new ConcretePrototype();
        prototype.setAttr("Test");
        prototype.setChildrenPrototype(new ChildrenPrototype());
        prototype.getChildrenPrototype().setChildrenAttr("Test2");
        //对原型类进行克隆
        Prototype prototype1 = prototype.clonePrototype();
        //对原型类的引用类型的字段的属性进行更改，查看是否进行了深复制
        prototype.getChildrenPrototype().setChildrenAttr("Test3");
        System.out.println(prototype1.getAttr());
        System.out.println(prototype1.getChildrenPrototype().getChildrenAttr());


    }
}
