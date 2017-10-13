package apaw.ecp1.xavi.composite;

public abstract class CustomerComponent {
	
	public abstract String view();
	public abstract void add(CustomerComponent customerComponent);
	public abstract void remove(CustomerComponent customerComponent);

}
