package abstractfactory;

import entity.bag.AppleBag;
import entity.bag.Bag;
import entity.fruit.Apple;
import entity.fruit.Fruit;

public class AppleFactory extends AbstractFactory {
    @Override
    public Fruit getFruit() {
        return new Apple();
    }

    @Override
    public Bag getBag() {
        return new AppleBag();
    }
}
