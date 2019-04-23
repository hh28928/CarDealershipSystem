package inventory.presenters;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Set;
import java.util.HashSet;

import finance.models.FinanceCarModel;
import inventory.models.CarModel;
import inventory.models.InventoryCarModel;
import inventory.views.InventoryCarRenderable;
import inventory.views.MainView;
import inventory.views.View;
import mailing.brokers.MessageBroker;
import mailing.messages.Message;
import mailing.publishers.Publisher;


public class InventoryPresenter implements Publisher
{
	//the mailing list message broker
	private MessageBroker broker;
	String data_location = "CarDatabase.csv";
	
	//the currently-selected view, defaults to the main view
	private View currentView;
	
	//the list of all cars currently in inventory
	Set<InventoryCarModel> inventoryItems;
	
	
	public InventoryPresenter(MessageBroker broker) {
		this.broker = broker;
		inventoryItems = loadInventoryItems();
		
		Set<InventoryCarRenderable> renderItems = new HashSet<InventoryCarRenderable>();
		for (InventoryCarModel car : inventoryItems) {
			renderItems.add(new InventoryCarRenderable(car.getVIN(), car.getMake(), car.getModel(), car.getColor(), car.getPrice()));
		}
		currentView = new MainView(inventoryItems, this);
	}
	
	public Set<InventoryCarModel> getInventoryItems() {
		return inventoryItems;
	}

	//replace the current view with the specified view
	public void switchView(View view) {
		this.currentView = view;
		renderView();
	}
	
	
	//publishes a message to the mailing list by pushing it to the message broker
	public void publish(MessageBroker broker, Message message) {
		broker.sendMessage(message);
	}
	
	
	//tells the currently-selected view to render
	private void renderView() {
		System.out.println(currentView.render());
	}
	
	
	//loads inventory from a source
	//TODO: add the ability to load from a file or something
	public Set<InventoryCarModel> loadInventoryItems() {
		Set<InventoryCarModel> items = new HashSet<InventoryCarModel>();
		try {
			items.add(new InventoryCarModel("0XV135ND234", "Honda", "Civic", "Blue", 20000));
		} catch (Exception e) {
			System.out.println("Error adding vehicle to inventory: " + e.getMessage());
		}
		return items;
	}
	
	
	public void addInventoryItem(String VIN, String make, String model, String color, int price) {
		try{
			CarModel addInventory = new CarModel(VIN, make, model, color);
			InventoryCarModel inventoryCarModel = new InventoryCarModel(VIN, make, model, color, price);
			FileWriter writer = new FileWriter(data_location,true);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write(VIN);
			bufferedWriter.write(make);
			bufferedWriter.write(model);
			bufferedWriter.write(color);
			bufferedWriter.close();
			writer.close();
			inventoryItems.add(inventoryCarModel);
		}
		catch (Exception e)
		{
			System.out.println("Sorry, but something was corupted with the information givin to addFinancedCar");
		}
	}
	
	
	public void updateInventoryItem(InventoryCarModel update_car) {
		for (InventoryCarModel s : inventoryItems) {
			if (s.getVIN().equals(update_car.getVIN())) {
				deleteInventoryItem(s);
				addInventoryItem(update_car.getVIN(), update_car.getMake(), update_car.getModel(), update_car.getColor(), update_car.getPrice());
			}
		}
	}
	
	
	public void deleteInventoryItem(InventoryCarModel removeCar) {
		try{
			this.inventoryItems.remove(removeCar);
		}
		catch (Exception e)
		{
			System.out.println("Sorry, but something was corupted with the information givin to remoFinancedCar");
		}
	}
}