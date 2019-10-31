package lazy;

/**
 * 懒汉式
 */
public class Lazy {
    private Lazy() {
    }

    private static Lazy lazy;

    public static Lazy getLazy() {
        if (lazy == null) {
            synchronized (Lazy.class) {
                if (lazy == null) {
                    lazy = new Lazy();
                }
            }
        }

        return lazy;
    }
}
