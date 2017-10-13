package apaw.ecp1.xavi.composite;

import java.util.ArrayList;
import java.util.List;

public class CustomerComposite extends CustomerComponent {
	
	private String name;
	private List<CustomerComponent> customerComponentList;

	public CustomerComposite(String name) {
		this.name = name;
		customerComponentList = new ArrayList<CustomerComponent>();
	}

	@Override
	public String view() {
		String result = this.name;
		System.out.println("StartGroup: " + name);
		for (CustomerComponent customer : customerComponentList) {
			result= result + "-"+ customer.view();
		}
		System.out.println("EndGroup: " + name);
		return result;
	}

	@Override
	public void add(CustomerComponent customerComponent) {
		this.customerComponentList.add(customerComponent);
	}

	@Override
	public void remove(CustomerComponent customerComponent) {
		this.customerComponentList.remove(customerComponent);
	}
}