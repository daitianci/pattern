package lazy;

/**
 * 懒汉式加载
 */
public class LazyInstance {
    //加volatile可以防止jvm指令重排序
    private static volatile LazyInstance lazyInstance = null;

    private LazyInstance() {

    }

    public static LazyInstance getInstance() {
        if (lazyInstance == null) {
            //进行类锁，才可以线程安全
            synchronized (LazyInstance.class) {
                if (lazyInstance == null) {
                    lazyInstance = new LazyInstance();
                }
            }
        }

        return lazyInstance;
    }
}
