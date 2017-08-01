package com.qcode.design.Behavioral.ChainOfResponsibility;

/**
 * 客户端类
 * 调用处理类
 * Created by jiaqi,zhang on 2017/8/1.
 */

class Client {
    public static void main(String[] args) {
        //实例化各个具体处理着

        Approver wjzhang,gyang,jguo,meeting;
        wjzhang = new Director("张无忌");//主任类
       // gyang = new VicePresident("杨过");//副董
        jguo = new President("郭靖");//董事
        meeting = new Congress("董事会");

     /*   //创建职责链
        wjzhang.setSuccessor(gyang);
        gyang.setSuccessor(jguo);
        jguo.setSuccessor(meeting);*/

        //改动职责链
        wjzhang.setSuccessor(jguo);
        jguo.setSuccessor(meeting);

        //创建采购单
        PurchaseRequest pr1 = new PurchaseRequest(45000,10001,"购买倚天剑");
        wjzhang.processRequest(pr1);

        PurchaseRequest pr2 = new PurchaseRequest(60000,10002,"购买《葵花宝典》");
        wjzhang.processRequest(pr2);

        PurchaseRequest pr3 = new PurchaseRequest(160000,10003,"购买《金刚经》");
        wjzhang.processRequest(pr3);

        PurchaseRequest pr4 = new PurchaseRequest(800000,10004,"购买桃花岛");
        wjzhang.processRequest(pr4);

        /*更改  如果将审批流程由“主任-->副董事长-->董事长-->董事会”调整为“主任-->董事长-->董事会”，
        * 只需要将主任的下一级具体处理着更改为董事即可*/
    }
}