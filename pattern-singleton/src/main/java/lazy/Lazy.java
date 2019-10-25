package lazy;

public class Lazy {
    private Lazy() {
    }

    private static Lazy lazy;

    public static synchronized Lazy getLazy() {
        if (lazy == null) {
            lazy = new Lazy();
        }

        return lazy;
    }
}
