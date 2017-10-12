package apaw.ecp1.xavi.builder;

import java.util.Calendar;

import apaw.ecp1.xavi.*;

public class CustomerBuilder {
	private Customer customer;

    public CustomerBuilder(int id) {
        this.customer = new Customer(id);
    }

    public CustomerBuilder name(String name) {
        customer.setName(name);
        return this;
    }
    
    public CustomerBuilder address(String address) {
        customer.setAddress(address);
        return this;
    }
    
    public CustomerBuilder date(Calendar date) {
        customer.setDate(date);
        return this;
    }
    
    public CustomerBuilder account(Account account) {
    		customer.setAccount(account);
    		return this;
    }

    public Customer build() {
        return customer;
    }
}
