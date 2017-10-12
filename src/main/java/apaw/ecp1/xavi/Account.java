package apaw.ecp1.xavi;

import java.util.Calendar;

public class Account {
	
	private long id;
	private Calendar opened;
	private double factor;
	private boolean active;
	
	public Account(long id) {
		assert id > 0;
		this.id = id;
	}
	
	public Account(long id, Calendar opened, double factor, boolean active) {
		assert id > 0;
		assert opened != null;
		assert factor > 0;
		assert opened != null;

		this.id = id;
		this.opened = opened;
		this.factor = factor;
		this.active = active;
	}

	public long getId() {
		return this.id;
	}
	
	public Calendar getOpened() {
		return this.opened;
	}
	
	public double getFactor() {
		return this.factor;
	}
	
	public boolean getActive() {
		return this.active;
	}


	public void setId(long id) {
		assert id > 0;
		this.id = id;
	}
	
	public void setOpened(Calendar opened) {
		assert opened != null;
		this.opened = opened;
	}
	
	public void setFactor(double factor) {
		assert factor > 0;
		this.factor = factor;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
}
