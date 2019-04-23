package inventory.views;

//an immutable class that is used purely for transferring data from the presenter to the view
public class InventoryCarRenderable {
	
	private String vin;
	private String make;
	private String model;
	private String color;
	private int price;
	
	public InventoryCarRenderable(String vin, String make, String model, String color, int price) {
		this.vin = vin;
		this.make = make;
		this.model = model;
		this.color = color;
		this.price = price;
	}
	
	public String getVIN() { return this.vin; }
	public String getMake() { return this.make; }
	public String getModel() { return this.model; }
	public String getColor() { return this.color; }
	public int getPrice() { return this.price; }
}