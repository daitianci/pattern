package bag;

/**
 * Created by 戴天赐 on 2019/11/9.
 * 打包装饰器
 * 除了实现bag接口，还要再把原来得bag对象传进来进行附加功能
 */
public class BagDecorator implements Bag {
    private Bag bag;

    public BagDecorator(Bag bag) {
        this.bag = bag;
    }

    public void pack() {
        bag.pack();
    }
}
