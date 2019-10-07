package abstractfactory;

import entity.ChangFu;
import entity.MengNiu;
import entity.Milk;
import entity.YiLi;

public class MilkFactory extends AbstractFactory {
    public Milk getChangFu() {
        return new ChangFu();
    }

    public Milk getMengNiu() {
        return new MengNiu();
    }

    public Milk getYiLi() {
        return new YiLi();
    }
}
