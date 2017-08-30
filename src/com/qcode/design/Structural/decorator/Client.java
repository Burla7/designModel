package com.qcode.design.Structural.decorator;

import com.qcode.design.Structural.decorator.compents.Window;
import com.qcode.design.Structural.decorator.decorator.BlackBorderDecorator;
import com.qcode.design.Structural.decorator.decorator.ScrollBarDecorator;

/**
 * Created by jiaqi,zhang on 2017/8/29.
 */
public class Client {
    public  static void main(String args[])
    {

        /*透明装饰模式*/
       /* Component  component; //全部使用抽象构件定义
        component = new Window();
        component = new  ScrollBarDecorator(component);
        component = new BlackBorderDecorator(component); //将装饰了一次之后的对象继续注入到另一个装饰类中，进行第二次装饰
        component.display();*/

       /*半透明装饰模式*/
        Component  component; //全部使用抽象构件定义
        component = new Window();
        ScrollBarDecorator scrollBarDecorator = new  ScrollBarDecorator(component);
        scrollBarDecorator.display();
        scrollBarDecorator.setScrollBar();




    }
}
