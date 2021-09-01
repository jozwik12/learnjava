package examples.jcf.hw.onlinestore.withoutlist.services;

import examples.jcf.hw.onlinestore.withoutlist.enteties.Product;

public interface ProductManagementService {

	Product[] getProducts();

	Product getProductById(int productIdToAddToCart);

}
