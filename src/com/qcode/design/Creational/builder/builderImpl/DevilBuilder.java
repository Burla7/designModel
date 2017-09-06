package com.qcode.design.Creational.builder.builderImpl;

import com.qcode.design.Creational.builder.ActorBuilder;

/**
 * 恶魔角色建造器：具体建造者
 * Created by jiaqi,zhang on 2017/9/5.
 */
public class DevilBuilder extends ActorBuilder
{
    public  void buildType()
    {
        actor.setType("恶魔");
    }
    public  void buildSex()
    {
        actor.setSex("妖");
    }
    public  void buildFace()
    {
        actor.setFace("丑陋");
    }
    public  void buildCostume()
    {
        actor.setCostume("黑衣");
    }
    public  void buildHairstyle()
    {
        actor.setHairstyle("光头");
    }
    /*钩子方法*/
    public   boolean isBareheaded(){
        return true;
    }
}