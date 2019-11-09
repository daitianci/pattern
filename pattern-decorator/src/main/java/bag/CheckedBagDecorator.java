package bag;

/**
 * Created by 戴天赐 on 2019/11/9.
 */
public class CheckedBagDecorator extends BagDecorator {
    //继承自bag装饰器，构造函数自动继承
    public CheckedBagDecorator(Bag bag) {
        super(bag);
    }

    /**
     * 除了执行原来的打包以后再增强额外的功能
     */
    @Override
    public void pack() {
        super.pack();  //调用原有业务方法
        checked();  //打印防伪标识
    }

    //增加防伪标识
    public void checked() {
        System.out.println("------");
        System.out.println("打印上防伪标识");
    }
}
