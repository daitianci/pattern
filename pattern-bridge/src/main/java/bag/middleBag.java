package bag;

/**
 * Created by 戴天赐 on 2019/11/9.
 */
public class middleBag extends AbstactBag {
    public void pick() {
        System.out.println("开始采摘果实啦");
        abstractMaterial.draw();
        System.out.println("采摘了一中袋");
    }
}
