package ait.cohort49.shop_g49.service.interfaces;

import ait.cohort49.shop_g49.model.entity.Product;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);

    List<Product> getAllActiveProducts();
    Product getProductById(Long id);

    Product updateProduct(Long id, Product product);
    Product deleteProduct (Long id);
    Product deleteProductByTitle(String title);

    Product restoreProductById(Long id);

    long getProductsCount();

    BigDecimal getTotalPrice();
    BigDecimal getAveragePrice();




}
