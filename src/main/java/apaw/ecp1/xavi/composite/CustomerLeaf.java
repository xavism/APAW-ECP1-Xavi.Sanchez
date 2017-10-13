package apaw.ecp1.xavi.composite;

import apaw.ecp1.xavi.Customer;

public class CustomerLeaf extends CustomerComponent{

	private Customer customer;

	public CustomerLeaf(Customer customer) {
		assert customer != null;
		this.customer = customer;
	}

	@Override
	public String view() {
		System.out.println("ID:" + customer.getId());
		return Integer.toString(customer.getId());
	}

	@Override
	public void add(CustomerComponent customerComponent) {
		System.out.println("Does not make sense");
	}

	@Override
	public void remove(CustomerComponent customerComponent) {
		System.out.println("Does not make sense");
	}
}
