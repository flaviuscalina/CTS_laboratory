package ro.ase.acs.classes;

public abstract class Vehicle {
	private String producer;
	private float speed;
	
	public Vehicle () {
		producer= "";
		speed=0;
	}
	public Vehicle (String producer, float speed) {
		this();
		if(producer!=null) {
		this.producer = producer;
	}
		this.speed=speed;
		}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	
	public float getSpeed() {
		return speed;
	}
	public abstract void start();
}
