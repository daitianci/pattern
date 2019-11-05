import abstractfactory.AbstractFactory;
import entity.bag.Bag;
import entity.fruit.Apple;
import entity.fruit.Fruit;
import factory.fruit.AppleFactory;
import factory.fruit.Factory;
import org.junit.Test;
import simplefactory.fruit.SimpleFactory;

public class FactoryTest {
    @Test
    public void testSimpleFactory(){
        SimpleFactory simpleFactory = new SimpleFactory();
        Fruit fruit = simpleFactory.getFruit(SimpleFactory.APPLE_TYPE);
        fruit.hello();

        Fruit banana = simpleFactory.getBanana();
        banana.hello();
    }

    @Test
    public void testFactory(){
        Factory factory = new AppleFactory();
        Fruit fruit = factory.getFruit();
        fruit.hello();
    }

    @Test
    public void testAbstractFactory(){
        AbstractFactory abstractFactory = new abstractfactory.AppleFactory();

        Fruit fruit = abstractFactory.getFruit();
        fruit.hello();

        Bag bag = abstractFactory.getBag();
        bag.hello();
    }

    @Test
    public void testForClass() throws IllegalAccessException, InstantiationException {
        Class<?> appleClass = Apple.class;

        Fruit fruit = (Fruit) appleClass.newInstance();

        fruit.hello();
    }
}
