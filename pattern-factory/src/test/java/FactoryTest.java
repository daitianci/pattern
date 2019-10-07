import abstractfactory.MilkFactory;
import entity.Milk;
import factory.ChangFuFactory;
import factory.Factory;
import org.junit.Test;
import simplefactory.SimpleMilkFactory;

public class FactoryTest {

    /**
     * 简单工厂模式
     * 用户需要再干预，需要了解传入的东西，有可能会拼写错误
     */
    @Test
    public void testSimpleFactory(){
        SimpleMilkFactory milkFactory = new SimpleMilkFactory();
        Milk milk = milkFactory.getMilk("mengniu");
        System.out.println(milk.getName());
    }

    /**
     * 工厂模式
     * 每个牛奶指定一个单一的工厂，通过是实例化不同的工厂来生产不同的实体
     * 这里需要配置产品跟工厂，增加了复杂度
     * 用户并不关心产品由哪一个工厂生产
     */
    @Test
    public void testFactory(){
        Factory factory = new ChangFuFactory();
        Milk milk = factory.getMilk();
        System.out.println(milk.getName());
    }

    /**
     * 抽象工厂模式
     * 用户只需要观察抽象工厂就可以了解能生产什么产品
     * 对用户而已，选择方式使程序更加健壮
     * 而且抽象工厂还可以配置公共逻辑更加便捷
     */
    @Test
    public void testAbstractFactory(){
        MilkFactory milkFactory = new MilkFactory();
        Milk yiLi = milkFactory.getYiLi();
        System.out.println(yiLi.getName());
    }
}
