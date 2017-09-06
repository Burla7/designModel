package com.qcode.design.Creational.builder;

/**
 * 测试类
 * 1.0 通过指挥者类指挥抽象类实现
 * 2.0 省略指挥者类 直接在抽象类方法中实现
 * Created by jiaqi,zhang on 2017/9/5.
 */
public class Client {


    public static void main(String[] args) {
        ActorBuilder ab; //针对抽象建造者编程
        ab =  (ActorBuilder)XMLUtil.getBean(); //反射生成具体建造者对象


        //v 1.0
      /*  ActorController ac = new  ActorController();
        Actor actor;
        actor = ac.construct(ab); //通过指挥者创建完整的建造者对象*/

        //v2.0
        Actor  actor;
        actor =  ab.construct();

        String  type = actor.getType();
        System.out.println(type  + "的外观：");
        System.out.println("性别：" + actor.getSex());
        System.out.println("面容：" + actor.getFace());
        System.out.println("服装：" + actor.getCostume());
        System.out.println("发型：" + actor.getHairstyle());
    }
}
