import bag.AbstactBag;
import bag.BigBag;
import material.AbstractMaterial;
import material.PaperMaterial;

/**
 * Created by 戴天赐 on 2019/11/9.
 * 桥接模式
 * 主要用于一种产品要进行多向扩展
 * 首先我们需要选择出一个主属性,其他属性通成员变量得接口编程引入
 */
public class BridgeTest {
    public static void main(String[] args) {
        //选择材料
        AbstractMaterial abstractMaterial = new PaperMaterial();

        //设置型号
        AbstactBag abstactBag = new BigBag();

        //桥接材料属性到型号主属性
        abstactBag.setAbstractMaterial(abstractMaterial);

        abstactBag.pick();
    }
}
