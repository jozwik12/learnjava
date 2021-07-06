package com.itbulls.learnit.javacore.finaltask.services;

import com.itbulls.learnit.javacore.finaltask.enteties.Product;

import java.util.List;

public interface ProductManagementService {

    List<Product> getProducts();

    Product getProductById(int productIdToAddToCart);

}
