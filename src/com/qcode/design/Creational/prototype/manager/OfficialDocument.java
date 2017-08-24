package com.qcode.design.Creational.prototype.manager;

/**
 * 文档原型类
 * Created by jiaqi,zhang on 2017/8/15.
 */
interface OfficialDocument extends  Cloneable
        {
public  OfficialDocument clone();
public  void display();
        }