package com.test.designpattern23demo.factroy_pattern.factroy;

import com.test.designpattern23demo.factroy_pattern.product.ConcreteProductA;
import com.test.designpattern23demo.factroy_pattern.product.Product;

/**
 * @project： DesignPattern23Demo
 * @package： com.test.designpattern23demo.factroy_pattern.factroy
 * @class: ConcreteFactroy
 * @author: 陆伟
 * @Date: 2017/4/16 23:01
 * @desc： TODO
 */
public class ConcreteFactroy extends Factroy {
    private static final String TAG = "ConcreteFactroy";

    @Override
    public ConcreteProductA createProduct() {
        return new ConcreteProductA();
    }

    @Override
    public <T extends Product> T createProduct(Class<T> clazz) {
        T product = null;
        try {
            product = clazz.newInstance();
        } catch(InstantiationException e) {
            e.printStackTrace();
        } catch(IllegalAccessException e) {
            e.printStackTrace();
        }
        return product;
    }
}
