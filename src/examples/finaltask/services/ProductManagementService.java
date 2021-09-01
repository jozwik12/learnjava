package examples.finaltask.services;

import java.util.List;

import examples.finaltask.enteties.Product;

public interface ProductManagementService {

	List<Product> getProducts();

	Product getProductById(int productIdToAddToCart);

}
