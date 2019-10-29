package abstractfactory;

import entity.bag.Bag;
import entity.bag.OrangeBag;
import entity.fruit.Fruit;
import entity.fruit.Orange;

public class OrangeFactory extends AbstractFactory {
    @Override
    public Fruit getFruit() {
        return new Orange();
    }

    @Override
    public Bag getBag() {
        return new OrangeBag();
    }
}
