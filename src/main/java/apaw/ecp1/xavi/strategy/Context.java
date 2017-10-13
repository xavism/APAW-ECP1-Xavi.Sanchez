package apaw.ecp1.xavi.strategy;

import apaw.ecp1.xavi.Customer;

public class Context {
	private WriteStrategy strategy;
	private Customer customer;
	public Context(WriteStrategy strategy, Customer customer)
	{
		this.strategy = strategy;
		this.customer = customer;
	}

	public void setStrategy(WriteStrategy strategy) {
		this.strategy = strategy;
	}
	
	public String writeNameandAddress()
	{
		return strategy.generateString(customer);
	}
}
