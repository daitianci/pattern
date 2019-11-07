import adapter.OrangerBagAdapter;
import entity.bag.AppleBag;
import entity.bag.OrangeBag;

/**
 * Created by 戴天赐 on 2019/11/7.
 */
public class AdapterTest {
    public static void main(String[] args) {
        AppleBag appleBag = new AppleBag();

        OrangeBag orangeBag = new OrangerBagAdapter(appleBag);

        orangeBag.hello();
    }
}
