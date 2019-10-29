package factory.fruit;

import entity.fruit.Fruit;

/**
 * 工厂模式
 * 单一产品的生产
 * 符合单一职责原则，开闭原则，依赖倒置原则（接口编程）
 * 新增产品，直接新增一个对应的工厂直接实现扩展
 */
public interface Factory {
    Fruit getFruit();
}
