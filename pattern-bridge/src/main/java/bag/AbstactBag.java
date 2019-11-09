package bag;

import material.AbstractMaterial;

/**
 * Created by 戴天赐 on 2019/11/9.
 * 通过抽象父类进行接口编程，继承一些公共逻辑,包括一些公共属性
 */
public abstract class AbstactBag {
    //这里得限定词必须要protected 因为这样才可以继承，不可用private
    protected AbstractMaterial abstractMaterial;

    public void setAbstractMaterial(AbstractMaterial abstractMaterial) {
        this.abstractMaterial = abstractMaterial;
    }

    public abstract void pick();
}
