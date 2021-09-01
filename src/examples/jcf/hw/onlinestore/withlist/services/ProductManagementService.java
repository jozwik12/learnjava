package examples.jcf.hw.onlinestore.withlist.services;

import java.util.List;

import examples.jcf.hw.onlinestore.withlist.enteties.Product;

public interface ProductManagementService {

	List<Product> getProducts();

	Product getProductById(int productIdToAddToCart);

}
