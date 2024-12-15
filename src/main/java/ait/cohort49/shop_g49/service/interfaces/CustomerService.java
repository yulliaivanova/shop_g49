package ait.cohort49.shop_g49.service.interfaces;

import ait.cohort49.shop_g49.model.entity.Customer;

import java.util.List;

public interface CustomerService {
   Customer saveCustomer (Customer customer );

   List<Customer> getAllActiveCustomers();
   Customer getCustomerById(Long id);

   Customer updateCustomer(Long id, Customer customer);
   Customer deleteCustomerById(Long id);
   Customer deleteCustomerByName(String name);

   Customer restoreCustomerById(Long id);

   long getCustomersCount();


}
