package ait.cohort49.shop_g49.repository;

import ait.cohort49.shop_g49.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long > {

}
