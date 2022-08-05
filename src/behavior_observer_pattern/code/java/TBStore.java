package behavior_observer_pattern.code.java;

import java.math.BigDecimal;
import java.util.*;

public class TBStore extends Observable {

    private Map<String, Product> products = new HashMap<>();

    public void addProduct(String name, BigDecimal price) {
        Product product = new Product(name, price);
        products.putIfAbsent(name, product);
        setChanged();
        this.notifyObservers(product);
    }

    public Map<String, Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "TBStore{" +
                "products=" + products +
                '}';
    }
}
