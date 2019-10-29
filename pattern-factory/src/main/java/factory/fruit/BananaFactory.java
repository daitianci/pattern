package factory.fruit;

import entity.fruit.Banana;
import entity.fruit.Fruit;

public class BananaFactory implements Factory {
    public Fruit getFruit() {
        return new Banana();
    }
}
