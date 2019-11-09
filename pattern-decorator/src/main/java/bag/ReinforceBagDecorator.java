package bag;

/**
 * Created by 戴天赐 on 2019/11/9.
 */
public class ReinforceBagDecorator extends BagDecorator {
    public ReinforceBagDecorator(Bag bag) {
        super(bag);
    }

    @Override
    public void pack() {
        super.pack();  //调用原有业务方法
        reinforce();
    }

    //加固包装
    public void reinforce() {
        System.out.println("------");
        System.out.println("加固了包装");
    }
}
