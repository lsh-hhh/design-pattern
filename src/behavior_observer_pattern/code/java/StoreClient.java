package behavior_observer_pattern.code.java;

import java.math.BigDecimal;

public class StoreClient {

    public static void main(String[] args) {

        TBStore tbStore = new TBStore();

        tbStore.addObserver(new CustomerA());
        tbStore.addObserver(new CustomerB());

        tbStore.addProduct("栗子", BigDecimal.ONE);
    }
}
