import bag.*;

/**
 * Created by 戴天赐 on 2019/11/9.
 * 装饰器模式
 * 1、定义一个继承自bag接口的装饰器类，该类实现原来pag的方法，同事传入一个bag对象，执行的方法调用传入bag对象对应的方法
 * 2、定义增强类
 * 3、继承自增强类，然后扩展方法
 */
public class TestDecorator {
    public static void main(String[] args) {
        Bag bag = new AppleBag();

        bag = new CheckedBagDecorator(bag);

        bag = new ReinforceBagDecorator(bag);

        bag = new SpeedDecorator(bag);

        bag.pack();;


    }
}
