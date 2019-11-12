/**
 * Created by 戴天赐 on 2019/11/12.
 * 组合模式
 * 将一组相似的实体抽象成同一种类
 */
public class TestComposite {
    public static void main(String[] args) {
        //根目录
        DistrictNode root = new DistrictNode("根");

        //一线目录
        root.addChild(new DistrictNode("上海"));
        root.addChild(new DistrictNode("天津"));
        DistrictNode districtNode = new DistrictNode("北京");
        root.addChild(districtNode);

        //二级目录
        districtNode.addChild(new DistrictNode("海淀区"));
        districtNode.addChild(new DistrictNode("西城区"));
        DistrictNode districtNode2 = new DistrictNode("朝阳区");
        districtNode.addChild(districtNode2);

        //三级目录
        districtNode2.addChild(new DistrictNode("三里屯"));
        districtNode2.addChild(new DistrictNode("朝阳外街"));
    }
}
