package apaw.ecp1.xavi.builder;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import apaw.ecp1.xavi.*;

public class CustomerBuilderTest {

	 @Test
	 public void testCustomerBuilder() {
		 Calendar date = Calendar.getInstance();
		 Account account = new Account(1, Calendar.getInstance(), 1.0, true);
		 Customer constructorCustomer = new Customer(1, "Xavi", "Donoso Cortés", date, account);
	     Customer builderCustomer = new CustomerBuilder(1).name("Xavi").address("Donoso Cortés").date(date).account(account).build();
	     assertEquals(constructorCustomer.getId(), builderCustomer.getId());
	     assertEquals(constructorCustomer.getName(), builderCustomer.getName());
	     assertEquals(constructorCustomer.getAddress(), builderCustomer.getAddress());
	     assertEquals(constructorCustomer.getAccount().getId(), builderCustomer.getAccount().getId());
	    }
}
