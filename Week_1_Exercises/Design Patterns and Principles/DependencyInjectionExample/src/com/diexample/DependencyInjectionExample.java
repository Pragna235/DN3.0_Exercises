package com.diexample;

public class DependencyInjectionExample {
    public static void main(String[] args) {
        
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        CustomerService customerService = new CustomerService(customerRepository);

        
        String customer = customerService.getCustomer("12345");
        System.out.println(customer);
    }
}
