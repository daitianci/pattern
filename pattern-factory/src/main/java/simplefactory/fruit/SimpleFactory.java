package simplefactory.fruit;

import entity.fruit.Apple;
import entity.fruit.Banana;
import entity.fruit.Fruit;
import entity.fruit.Orange;

/**
 * 简单工厂模式
 * 缺点：1、不符合单一职责原则，一个类创建很多种类型
 *      2、不符合开闭原则，每次新增水果，都要修改SimpleFactory类，对扩展开放，对修改关闭
 */
public class SimpleFactory {
    //方式1：传入字符串来创建对应的实体
    public static final String APPLE_TYPE = "apple";
    public static final String BANANA_TYPE = "banana";
    public static final String ORANGE_TYPE = "orange";

    public Fruit getFruit(String fruitType) {
        if (APPLE_TYPE.equals(fruitType)) {
            return new Apple();
        } else if (BANANA_TYPE.equals(fruitType)) {
            return new Banana();
        } else if (ORANGE_TYPE.equals(fruitType)) {
            return new Orange();
        } else {
            return null;
        }
    }

    //方式2：通过方法区分返回的实体，简单工厂模式，方式区分更加简单
    public Fruit getApple(){
        return new Apple();
    }

    public Fruit getBanana(){
        return new Banana();
    }

    public Fruit getOrange(){
        return new Orange();
    }
}
