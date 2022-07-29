package create_builder_partner.code.house.builder;

import create_builder_partner.code.house.house.House;
import create_builder_partner.code.house.house.TallBuilding;

public class TallBuildingBuilder implements Builder{

    private House house;

    public TallBuildingBuilder() {
        house = new TallBuilding();
    }

    @Override
    public void buildBase() {
        house.setBase("建设高楼地基~");
    }

    @Override
    public void buildMainBody() {
        house.setMainBody("高楼主体建设");
    }

    @Override
    public void buildOutDecoration() {
        house.setOutDecoration("高楼外装修~");
    }

    @Override
    public void buildInDecoration() {
        house.setInDecoration("高楼内装修~");
    }

    @Override
    public House build() {
        return house;
    }

    @Override
    public void reset() {
        house = null;
    }
}
