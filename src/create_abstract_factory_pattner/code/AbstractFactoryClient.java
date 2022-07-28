package create_abstract_factory_pattner.code;

import create_abstract_factory_pattner.code.factories.ESportsFactory;
import create_abstract_factory_pattner.code.product.FinishedProduct;

public class AbstractFactoryClient {

    public static void main(String[] args) {

        FinishedProduct product = new FinishedProduct(new ESportsFactory());
        product.description();
    }
}
