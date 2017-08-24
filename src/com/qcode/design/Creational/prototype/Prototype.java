package com.qcode.design.Creational.prototype;

import java.io.Serializable;

/**
 * 抽象原型类
 * 所有具体原型类的公共父类，可以是接口抽象类或者具体实现类
 * Created by jiaqi,zhang on 2017/8/14.
 */
public abstract class Prototype implements Cloneable,Serializable {

    private  String attr;
    private ChildrenPrototype childrenPrototype;

    public ChildrenPrototype getChildrenPrototype() {
        return childrenPrototype;
    }

    public void setChildrenPrototype(ChildrenPrototype childrenPrototype) {
        this.childrenPrototype = childrenPrototype;
    }

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    public abstract Prototype clonePrototype();
}
