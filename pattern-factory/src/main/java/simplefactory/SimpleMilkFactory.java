package simplefactory;

import entity.ChangFu;
import entity.MengNiu;
import entity.Milk;
import entity.YiLi;


public class SimpleMilkFactory {

    /**
     * 用户根据类型返回实体
     *
     * @param milkType
     * @return
     */
    public Milk getMilk(String milkType) {
        if ("changfu".equals(milkType)) {
            return new ChangFu();
        } else if ("mengniu".equals(milkType)) {
            return new MengNiu();
        } else {
            return new YiLi();
        }
    }
}
