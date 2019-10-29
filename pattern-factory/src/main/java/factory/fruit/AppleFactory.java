package factory.fruit;

import entity.fruit.Apple;
import entity.fruit.Fruit;

public class AppleFactory implements Factory{
    public Fruit getFruit() {
        return new Apple();
    }
}
