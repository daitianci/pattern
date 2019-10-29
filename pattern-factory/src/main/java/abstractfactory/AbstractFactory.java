package abstractfactory;

import entity.bag.Bag;
import entity.fruit.Fruit;

/**
 * 抽象工厂模式
 * 一系列的产品组合生产的时候使用,以免组合混乱。每一种组合生成是一个工厂。
 * 符合单一职责原则，开闭原则，依赖倒置原则（接口编程）
 * 新增产品，直接新增一个对应的工厂直接实现扩展
 */
public abstract class AbstractFactory {
    public abstract Fruit getFruit();

    public abstract Bag getBag();
}
