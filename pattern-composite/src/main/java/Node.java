import java.util.List;

/**
 * Created by 戴天赐 on 2019/11/12.
 */
public abstract class Node {
    private String name;

    public abstract List<Node> getChildren();

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
