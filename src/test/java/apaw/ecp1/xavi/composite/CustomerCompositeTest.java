package apaw.ecp1.xavi.composite;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import apaw.ecp1.xavi.*;
import apaw.ecp1.xavi.builder.CustomerBuilder;

public class CustomerCompositeTest {

	private Account account;
	private Customer customer1;
	private Customer customer2;
	private Customer customer3;
	private Customer customer999;

	
	private CustomerComponent customerComponent;
	
	@Before
    public void before() {
		Calendar date = Calendar.getInstance();
		account = new Account(1, Calendar.getInstance(), 1.0, true);
	    customer1 = new CustomerBuilder(1).name("Xavi").address("Donoso Cortés").date(date).account(account).build();
	    customer2 = new CustomerBuilder(2).name("Xavier").address("Donoso Cortés").date(date).account(account).build();
	    customer3 = new CustomerBuilder(3).name("Javi").address("Donoso Cortés").date(date).account(account).build();
	    customer999 = new CustomerBuilder(999).name("Leo").address("Donoso Cortés").date(date).account(account).build();

	    
	    customerComponent = new CustomerComposite("First");
	    CustomerComponent tempComponent = new CustomerComposite("Group1");
	    
	    tempComponent.add(new CustomerLeaf(customer1));
	    tempComponent.add(new CustomerLeaf(customer999));

	    customerComponent.add(tempComponent);

	    customerComponent.add(new CustomerLeaf(customer2));
	    customerComponent.add(new CustomerLeaf(customer3));
	    
	}
	
	@Test
    public void testView() {
		assertEquals("First-Group1-1-999-2-3",customerComponent.view());
	}

}
