package ait.cohort49.shop_g49.service;

import ait.cohort49.shop_g49.model.entity.Product;
import ait.cohort49.shop_g49.repository.ProductRepository;
import ait.cohort49.shop_g49.service.interfaces.ProductService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product) {
        product.setActive(true);
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllActiveProducts() {
        return productRepository.findAll().stream()
                .filter(Product::isActive)
                .toList();
    }

    @Override
    public Product getProductById(Long id) {
       Product product = productRepository.findById(id).orElse(null);
       if (product == null || !product.isActive()){
           return null;
       }
       return product;

    }

    @Override
    public Product updateProduct(Long id, Product product) {
        return null;
    }

    @Override
    public Product deleteProduct(Long id) {
        return null;
    }

    @Override
    public Product deleteProductByTitle(String title) {
        return null;
    }

    @Override
    public Product restoreProductById(Long id) {
        return null;
    }

    @Override
    public long getProductsCount() {
        return 0;
    }

    @Override
    public BigDecimal getTotalPrice() {
        return null;
    }

    @Override
    public BigDecimal getAveragePrice() {
        return null;
    }
}
