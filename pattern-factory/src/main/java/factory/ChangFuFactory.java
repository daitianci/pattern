package factory;

import entity.ChangFu;
import entity.Milk;

public class ChangFuFactory implements Factory {
    public Milk getMilk() {
        return new ChangFu();
    }
}
