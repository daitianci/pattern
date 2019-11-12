import java.util.ArrayList;
import java.util.List;

/**
 * Created by 戴天赐 on 2019/11/12.
 */
public class DistrictNode extends Node {
    private List<Node> children = new ArrayList<Node>();

    public DistrictNode(String name) {
        super(name);
    }

    @Override
    public List<Node> getChildren() {
        return children;
    }

    public void addChild(Node node){
        children.add(node);
    }

    public void delChild(int i){
        children.remove(i);
    }
}
