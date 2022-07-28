package create_builder_pattner.code.house;

import create_builder_pattner.code.house.director.HouseDirector;
import create_builder_pattner.code.house.house.House;

public class HouseBuildClient {

    public static void main(String[] args) {

        HouseDirector director = new HouseDirector();

        House house = director.buildCottage();
        System.out.println(house);

        House tallBuilding = director.buildTallBuilding();
        System.out.println(tallBuilding);
    }
}
