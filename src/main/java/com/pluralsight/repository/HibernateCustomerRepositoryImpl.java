package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<Customer>();

		Customer customer = new Customer();
		customer.setFirstName("Kacel");
		customer.setLastName("Sabrina");

		customers.add(customer);

		return customers;

	}

}
