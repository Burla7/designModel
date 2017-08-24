package com.qcode.design.Creational.prototype;

import java.io.Serializable;

/**
 * 原型类中的包含类  为了验证深复制以及浅复制
 * Created by jiaqi,zhang on 2017/8/14.
 */
public class ChildrenPrototype implements Serializable{
    private String childrenAttr;

    public String getChildrenAttr() {
        return childrenAttr;
    }

    public void setChildrenAttr(String childrenAttr) {
        this.childrenAttr = childrenAttr;
    }
}
