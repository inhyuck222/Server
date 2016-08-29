package util;

import java.util.HashMap;
import java.util.Map;

import beans.Customer;

public class CustomerMap {

	private Map<String, Customer> customers;

	public CustomerMap() {
		customers = new HashMap<String, Customer>();

		addCustomer(new Customer("id001", "Alice", "alice@hansung.ac.kr"));
		addCustomer(new Customer("id002", "Bob", "bob@hansung.ac.kr"));
		addCustomer(new Customer("id003", "Charlie", "char@hansung.ac.kr"));
	}

	private void addCustomer(Customer customer) {
		customers.put(customer.getId(), customer);
	}

	public Customer findCustomer(String id) {
		if (id != null) {
			return (customers.get(id.toLowerCase()));
		} else {
			return null;
		}
	}
}
