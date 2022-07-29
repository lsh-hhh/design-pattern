package create_builder_partner.code.house.director;

import create_builder_partner.code.house.builder.Builder;
import create_builder_partner.code.house.builder.CottageBuilder;
import create_builder_partner.code.house.builder.TallBuildingBuilder;
import create_builder_partner.code.house.house.House;

public class HouseDirector {

    private final Builder cottageBuilder = new CottageBuilder();

    private final Builder tallBuildingBuilder = new TallBuildingBuilder();

    public House buildCottage() {
        cottageBuilder.buildBase();
        cottageBuilder.buildMainBody();
        cottageBuilder.buildOutDecoration();
        cottageBuilder.buildInDecoration();
        House build = cottageBuilder.build();
        cottageBuilder.reset();
        return build;
    }

    public House buildTallBuilding() {
        tallBuildingBuilder.buildBase();
        tallBuildingBuilder.buildMainBody();
        tallBuildingBuilder.buildOutDecoration();
        tallBuildingBuilder.buildInDecoration();
        House build = tallBuildingBuilder.build();
        tallBuildingBuilder.reset();
        return build;
    }

}
