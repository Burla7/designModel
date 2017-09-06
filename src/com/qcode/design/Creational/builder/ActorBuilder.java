package com.qcode.design.Creational.builder;

/**
 * Created by jiaqi,zhang on 2017/9/5.
 */
public abstract class ActorBuilder {
    //v1.0
    //protected  Actor actor = new Actor();
    protected static Actor actor = new  Actor();

    public  abstract void buildType();
    public  abstract void buildSex();
    public  abstract void buildFace();
    public  abstract void buildCostume();

    public  abstract void buildHairstyle();
/*钩子方法*/
    public   boolean isBareheaded(){
        return false;
    }
/* v1,0
    //工厂方法，返回一个完整的游戏角色对象
    public Actor createActor()
    {
        return actor;
    }
*/
/*v2.0*/
    public  Actor  construct()
    {
        this.buildType();
        this.buildSex();
        this.buildFace();
        this.buildCostume();
        this.buildHairstyle();
        //通过钩子方法来控制产品的构建
        if(!this.isBareheaded())
        {
            this.buildHairstyle();
        }
        return actor;
    }
}
