package com.qcode.design.Creational.prototype;

import java.io.*;

/**
 * Created by jiaqi,zhang on 2017/8/14.
 */
public class ConcretePrototype extends Prototype {


    public Prototype clonePrototype() {
        //1.利用面向对象的特性实现原型克隆
      /*  Prototype  prototype = new ConcretePrototypeA(); //创建新对象
        prototype.setAttr(this.getAttr());
        return prototype;*/

        //2.利用java语言提供的clone方法 浅复制 如果是派生类 实现Cloneable接口
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException exception) {
            System.err.println("Not support cloneable不支持复制");
        }
        return (Prototype) object;

        //3.深克隆 原型实现Serializable接口
     /*   return  CloneUtils.clone(this);*/
    }

}
