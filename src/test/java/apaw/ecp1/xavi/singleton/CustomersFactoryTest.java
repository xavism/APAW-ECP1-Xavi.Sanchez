package apaw.ecp1.xavi.singleton;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import apaw.ecp1.xavi.Account;
import apaw.ecp1.xavi.Customer;


public class CustomersFactoryTest {
	
	private Customer customer;
	private Account account;
	private CustomersFactory customersFactory;
	
	@Before
    public void before() {
		customersFactory = CustomersFactory.getCustomersFactory();
		account = new Account(1, Calendar.getInstance(), 1.0, true);
        customer = new Customer (1, "Xavi", "Donoso Cortes", Calendar.getInstance(), account);
    }
	
	@Test
    public void testIsSingleton() {
        assertSame(CustomersFactory.getCustomersFactory(), CustomersFactory.getCustomersFactory());
    }
    
    @Test
    public void testSingletonNotNull() {
        assertNotNull(CustomersFactory.getCustomersFactory());
    }
    
    @Test
    public void testAddandGetCustomer() {
    		customersFactory.setCustomer(customer);
        assertEquals(customer, customersFactory.getCustomer(1));
    }
}
