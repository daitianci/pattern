package hungry;

/**
 * 饿汉式
 */
public class Hungry {
    private Hungry() {
    }

    public static final Hungry hungry = new Hungry();
}
