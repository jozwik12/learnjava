package com.itbulls.learnit.javacore.finaltask.storage;

import com.itbulls.learnit.javacore.finaltask.enteties.Product;

import java.util.List;

public interface ProductStoringService {

    List<Product> loadProducts();

}
