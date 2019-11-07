package hungry;

/**
 * 饿汉式
 * 在程序启动以后就初始化好对象
 * 优点 线程安全
 * 缺点 数量多的时候占了没必要的内存
 */
public class HungryInstance {

    private static final HungryInstance hungryInstance = new HungryInstance();

    /**
     * 单例模式构造方法必须私有
     */
    private HungryInstance() {

    }

    public static HungryInstance getInstancc(){
        return hungryInstance;
    }
}
