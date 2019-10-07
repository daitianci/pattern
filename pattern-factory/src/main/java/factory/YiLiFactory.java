package factory;

import entity.Milk;
import entity.YiLi;

public class YiLiFactory implements Factory {
    public Milk getMilk() {
        return new YiLi();
    }
}
