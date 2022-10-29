package com.prafull.springbootdemo.Product;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    public List<ProductEntity> getProducts(){

        return Arrays.asList(
                new ProductEntity("prod1", 1230.34f),
                new ProductEntity("prod2", 340),
                new ProductEntity("prod3", 760.23f),
                new ProductEntity("prod4", 989.67f)
        );
    }

}
