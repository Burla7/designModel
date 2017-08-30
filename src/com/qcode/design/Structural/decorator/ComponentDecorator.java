package com.qcode.design.Structural.decorator;

/**
 * 构建装饰类：抽象装饰类
 * Created by jiaqi,zhang on 2017/8/29.
 */
public class ComponentDecorator extends Component {
    //维持对抽象构件类型对象的引用
    private Component component;


    //注入抽象构建类型的对象
    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
    component.display();
    }
}
