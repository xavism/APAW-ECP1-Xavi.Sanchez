package apaw.ecp1.xavi.strategy;

import apaw.ecp1.xavi.Customer;

public class Space implements WriteStrategy{
	
	@Override
	public String generateString(Customer customer) {
		return customer.getName() + " " + customer.getAddress();
	}
}