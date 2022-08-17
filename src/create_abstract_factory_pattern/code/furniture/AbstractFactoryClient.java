package create_abstract_factory_pattern.code.furniture;

import create_abstract_factory_pattern.code.furniture.factories.ESportsFactory;
import create_abstract_factory_pattern.code.furniture.factories.NormalFactory;
import create_abstract_factory_pattern.code.furniture.product.FinishedProduct;
import create_abstract_factory_pattern.code.furniture.product.NormalProduct;

public class AbstractFactoryClient {

    public static void main(String[] args) {

        FinishedProduct product = new FinishedProduct(new ESportsFactory());
        product.description();

        System.out.println();
        NormalProduct normalProduct = new NormalProduct(new NormalFactory());
        normalProduct.description();
    }
}
