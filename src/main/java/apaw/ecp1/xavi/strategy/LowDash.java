package apaw.ecp1.xavi.strategy;

import apaw.ecp1.xavi.Customer;

public class LowDash implements WriteStrategy{
	
	@Override
	public String generateString(Customer customer) {
		return customer.getName() + "_" + customer.getAddress();
	}
}