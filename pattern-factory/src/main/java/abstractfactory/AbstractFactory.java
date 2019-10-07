package abstractfactory;

import entity.Milk;

public abstract class AbstractFactory {
    //公共逻辑
    //方便统一管理

    public abstract Milk getChangFu();

    public abstract Milk getMengNiu();

    public abstract Milk getYiLi();
}
