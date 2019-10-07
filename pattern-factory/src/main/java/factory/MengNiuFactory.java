package factory;

import entity.MengNiu;
import entity.Milk;

public class MengNiuFactory implements Factory {
    public Milk getMilk() {
        return new MengNiu();
    }
}
