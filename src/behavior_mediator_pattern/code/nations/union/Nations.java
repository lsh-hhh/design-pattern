package behavior_mediator_pattern.code.nations.union;

import behavior_mediator_pattern.code.nations.country.Country;

public interface Nations {

    void send(String msg, Country country);
}
