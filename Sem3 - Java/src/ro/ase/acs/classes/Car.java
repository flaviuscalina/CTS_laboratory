package ro.ase.acs.classes;

import ro.ase.acs.interfaces.Taxable;

public  class Car extends Vehicle implements Taxable {
	public String model;
	private int capacity;
	
	public Car() {
		//super();
		this.model = "";
		this.capacity = 0;
	}
	
	public  Car (String producer,String model, float speed, int capacityu) {
		super(producer, speed);
		this.model=model;
		this.capacity=capacity;
	}
	
	@Override
	public float computeTax() {

		if(capacity<2000) {
			return capacity * 0.05f;
		}
		else
		{
			return capacity * 0.1f;
		}
	}

	@Override
	public void start() {
		System.out.println("The car has started and is running with"+ getSpeed()+"km/h.");
	}
	
}
