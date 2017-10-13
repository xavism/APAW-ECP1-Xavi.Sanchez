package apaw.ecp1.xavi.strategy;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import apaw.ecp1.xavi.Account;
import apaw.ecp1.xavi.Customer;

public class CustomerStrategyTest {

	private Customer customer;
	private Account account;
	
	private Context context;
	private Space strategySpace;
	private LowDash strategyLowDash;
	
	@Before
    public void before() {
		account = new Account(1, Calendar.getInstance(), 1.0, true);
        customer = new Customer (1, "Xavi", "Donoso Cortes", Calendar.getInstance(), account);
        
        strategySpace = new Space();
        strategyLowDash = new LowDash();
        context = new Context (strategySpace, customer);
	}
	
	@Test
    public void testStrategySpace() {
		context.setStrategy(strategySpace);
        assertEquals("Xavi Donoso Cortes", context.writeNameandAddress());
    }
	
	@Test
    public void testStrategyLowDash() {
		context.setStrategy(strategyLowDash);
        assertEquals("Xavi_Donoso Cortes", context.writeNameandAddress());
    }

}
