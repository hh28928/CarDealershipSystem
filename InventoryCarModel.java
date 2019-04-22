package inventory.models;

public class InventoryCarModel extends CarModel {
	
	private int price;
	
	public InventoryCarModel(String vin, String make, String model, String color, int price) throws IllegalArgumentException {
		super(vin, make, model, color);
		
		if (price < 0) {
			throw new IllegalArgumentException("Sorry, price must be a positive number!");
		}
		
		this.price = price;
	}
	
	
	public int getPrice() { return this.price; }
	
	public void setPrice(int price) throws IllegalArgumentException {
		if (price < 0) {
			throw new IllegalArgumentException("Sorry, price must be a positive number!");
		}
		
		this.price = price;
	}
	
	
	public String toString() {
		return this.vin;
	}
}