package apaw.ecp1.xavi.singleton;

import java.util.HashMap;
import java.util.Map;

import apaw.ecp1.xavi.*;

public class CustomersFactory {

	private Map<Integer, Customer> customersCollection;
	private static CustomersFactory instance;

	private CustomersFactory() {
		customersCollection = new HashMap<Integer, Customer>();
	}

	public static CustomersFactory getCustomersFactory() {
		if (instance == null)
			instance = new CustomersFactory();
		return instance;
	}

	public Customer getCustomer(int id) {
		assert id > 0;
		return customersCollection.get(id);
	}

	public void setCustomer(Customer customer) {
		assert customer != null;
		customersCollection.put(customer.getId(), customer);
	}
}
