package com.qcode.design.Creational.singleton;

/**
 * 单例模式-简单实现
 * 任务管理类 模拟windows 任务管理器
 * Created by jiaqi,zhang on 2017/8/1.
 */
class TaskManager {
    //设计静态唯一本类类型 私有成员变量
    private static TaskManager tm = null;
//    private static TaskManager tm = new TaskManager();


    /**
     * 为了不让其他类可以new出该类
     * 将构造方法设置为私有
     */
    private TaskManager() {
    } //初始化窗口

    /**
     * 判断私有变量tm是否为被初始化过，也就是说只有第一次调用被重新new
     * 其他为返回第一次调用new的对象从而实现了单例
     * @return
     */
    public static TaskManager getInstance()
    {
        if (tm == null)
        {
            tm = new TaskManager();
        }
        return tm;
    }
    public void displayProcesses() {
    } //显示进程

    public void displayServices() {
    } //显示服务

}

