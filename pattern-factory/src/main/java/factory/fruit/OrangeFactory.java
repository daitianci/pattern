package factory.fruit;

import entity.fruit.Fruit;
import entity.fruit.Orange;

public class OrangeFactory implements Factory {
    public Fruit getFruit() {
        return new Orange();
    }
}
