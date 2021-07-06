package com.itbulls.learnit.javacore.jcf.hw.onlinestore.withlist.services;

import com.itbulls.learnit.javacore.jcf.hw.onlinestore.withlist.enteties.Product;

import java.util.List;

public interface ProductManagementService {

    List<Product> getProducts();

    Product getProductById(int productIdToAddToCart);

}
