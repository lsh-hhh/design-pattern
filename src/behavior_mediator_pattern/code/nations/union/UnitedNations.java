package behavior_mediator_pattern.code.nations.union;

import behavior_mediator_pattern.code.nations.country.Country;

import java.util.HashMap;
import java.util.Map;

public class UnitedNations implements Nations{
    Map<String, Country> countries = new HashMap<>();

    public void register(Country country) {
        country.setNations(this);
        countries.putIfAbsent(country.getName(), country);
    }

    @Override
    public void send(String msg, Country country) {
        msg = country.getCountryName() + "说：'" + msg + "'";
        System.out.println(msg);
        String finalMsg = msg;
        countries.forEach((k, v) -> {
            if (!k.equals(country.getName())) {
                v.notify(finalMsg);
            }
        });
    }

    // 发起提案
    public void proposal(String proposal, Country country) {

    }
}
