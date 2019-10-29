package abstractfactory;

import entity.bag.Bag;
import entity.bag.BananaBag;
import entity.fruit.Banana;
import entity.fruit.Fruit;

public class BananaFactory extends AbstractFactory {
    @Override
    public Fruit getFruit() {
        return new Banana();
    }

    @Override
    public Bag getBag() {
        return new BananaBag();
    }
}
