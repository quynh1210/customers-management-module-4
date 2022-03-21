package com.codegym.Service;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService implements ICustomerService {
    public static final Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "John", "john@codegym.com", "Texas"));
        customers.put(2, new Customer(2, "Hana", "hana@gmail.com", "Florida"));
        customers.put(3, new Customer(3, "Send", "send@gmail.com", "Orange"));
        customers.put(4, new Customer(4, "Chiko", "chiko@gmail.com", "Florida"));
        customers.put(5, new Customer(5, "Vanessa", "vanessa@gmail.com", "New York"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
