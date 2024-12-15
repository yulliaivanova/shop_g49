package ait.cohort49.shop_g49.service;

import ait.cohort49.shop_g49.model.entity.Customer;
import ait.cohort49.shop_g49.repository.CustomerRepository;
import ait.cohort49.shop_g49.service.interfaces.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        customer.setActive(true);
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllActiveCustomers() {
        return customerRepository.findAll().stream()
                .filter(Customer::isActive)
                .toList();
    }

    @Override
    public Customer getCustomerById(Long id) {
        Customer customer = customerRepository.findById(id).orElse(null);
        if (customer == null || !customer.isActive()) {
            return null;
        }
        return customer;
    }

    @Override
    public Customer updateCustomer(Long id, Customer customer) {
        return null;
    }

    @Override
    public Customer deleteCustomerById(Long id) {
        return customerRepository.findById(id)
                .map(customer -> {
                    customer.setActive(false);
                    return customerRepository.save(customer);
                })
                .orElse(null);
    }

    @Override
    public Customer deleteCustomerByName(String name) {
        return null;
    }

    @Override
    public Customer restoreCustomerById(Long id) {
        return null;
    }

    @Override
    public long getCustomersCount() {
        return customerRepository.findAll().stream()
                .filter(Customer::isActive)
                .count();
    }
}
