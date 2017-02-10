package com.qcode.jqzhangl.build.Prototype;

/**
 * 建造者模式(原型克隆)
 * Created by Administrator on 2017/1/10.
 */
public class Prototype  implements  Cloneable{

    public Object clone() throws CloneNotSupportedException {
        Prototype proto = (Prototype) super.clone();
        return  proto;
    }

}
