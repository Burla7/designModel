package com.qcode.design.Behavioral.ChainOfResponsibility;

/**
 * 审批者抽象类
 * 抽象处理者 处理请求的接口 定义抽象请求处理方法
 * Created by jiaqi,zhang on 2017/8/1.
 */

abstract class Approver {
    protected Approver successor; //定义后继对象
    protected String name; //审批者姓名

    public Approver(String name) {
        this.name = name;
    }

    //设置后继者
    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    //抽象请求处理方法
    public abstract void processRequest(PurchaseRequest request);
}