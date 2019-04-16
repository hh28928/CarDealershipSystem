package inventory.models;

public class CarModel {
	protected String vin;
	protected String make;
	protected String model;
	protected String color;
	
	public CarModel(String vin, String make, String model, String color) {
		this.vin = vin;
		this.make = make;
		this.model = model;
		this.color = color;
	}
	
	public String getVIN() { return this.vin; }
	public String getMake() { return this.make; }
	public String getModel() { return this.model; }
	public String getColor() { return this.color; }
}