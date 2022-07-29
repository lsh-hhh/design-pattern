package create_builder_partner.code.house.builder;

import create_builder_partner.code.house.house.House;

public interface Builder {

    // 地基
    void buildBase();

    // 房屋主体
    void buildMainBody();

    // 外装修
    void buildOutDecoration();

    // 内装修
    void buildInDecoration();

    // 交房
    House build();

    // 重置
    void reset();

}
