package create_builder_partner.code.house.builder;

import create_builder_partner.code.house.house.Cottage;
import create_builder_partner.code.house.house.House;

public class CottageBuilder implements Builder{

    private House house;

    public CottageBuilder() {
        house = new Cottage();
    }
    @Override
    public void buildBase() {
        house.setBase("建设小屋地基~");
    }

    @Override
    public void buildMainBody() {
        house.setMainBody("建设小屋主体~");
    }

    @Override
    public void buildOutDecoration() {
        house.setOutDecoration("建设小屋外装修~");
    }

    @Override
    public void buildInDecoration() {
        house.setInDecoration("建设小屋内装修~");
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
