package ait.cohort49.shop_g49.controller;


import ait.cohort49.shop_g49.model.entity.Customer;
import ait.cohort49.shop_g49.model.entity.Product;
import ait.cohort49.shop_g49.service.interfaces.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private final CustomerService customerService;


    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/{customerId})")
    public Customer getById(@PathVariable("customerId") Long id) {
        return customerService.getCustomerById(id);
    }

    @GetMapping
    public List<Customer> getAll() {
        return customerService.getAllActiveCustomers();
    }

    @PostMapping("/{id}")
    public Customer update(@PathVariable Long id, @RequestBody Customer customer) {
        return customerService.updateCustomer(id, customer);
    }

    @DeleteMapping("/{id}")
    public Customer remove(@PathVariable Long id) {
        return customerService.deleteCustomerById(id);
    }

    @DeleteMapping("/by-title")
    public Customer deleteCustomerByName(@RequestParam String name) {
        return customerService.deleteCustomerByName(name);
    }

    @PutMapping("/restore/{id}")
    public Customer restoreCustomerById(@PathVariable Long id) {
        return customerService.restoreCustomerById(id);
    }

    @GetMapping("/count")
    public long getCustomersCount() {
        return customerService.getCustomersCount();
    }


}
