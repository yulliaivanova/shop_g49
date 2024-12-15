package ait.cohort49.shop_g49.repository;

import ait.cohort49.shop_g49.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
