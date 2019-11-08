package adapter;

import entity.bag.AppleBag;
import entity.bag.OrangeBag;

/**
 * Created by 戴天赐 on 2019/11/7.
 * 适配器模式
 * 当橘子包装盒用完以后，利用适配器，将苹果包装盒乔装成橘子包装盒进行打包
 * 通过重载橘子得hello方法，来调用苹果得hello方法进行调用
 * 苹果包装盒必须已经存在
 * 扩展：这个可以用于源码的扩展，利用继承，然后重写方法来增加原来方法
 */
public class OrangerBagAdapter extends OrangeBag{
    private AppleBag appleBag;

    public OrangerBagAdapter(AppleBag appleBag) {
        this.appleBag = appleBag;
    }

    @Override
    public void hello() {
        appleBag.hello();
    }
}
