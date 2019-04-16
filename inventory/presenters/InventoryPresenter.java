package inventory.presenters;

import java.util.Set;
import java.util.HashSet;
import mailing.brokers.MessageBroker;
import mailing.publishers.Publisher;
import mailing.messages.Message;
import inventory.views.View;
import inventory.views.MainView;
import inventory.views.DetailView;
import inventory.views.InventoryCarRenderable;
import inventory.models.*;


public class InventoryPresenter implements Publisher
{
	//the mailing list message broker
	private MessageBroker broker;
	
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
		currentView = new MainView(renderItems);
		this.renderView();
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
	private Set<InventoryCarModel> loadInventoryItems() {
		Set<InventoryCarModel> items = new HashSet<InventoryCarModel>();
		try {
			items.add(new InventoryCarModel("0XV135ND234", "Honda", "Civic", "Blue", 20000));
		} catch (Exception e) {
			System.out.println("Error adding vehicle to inventory: " + e.getMessage());
		}
		return items;
	}
	
	
	public void addInventoryItem() {
		
	}
	
	
	public void updateInventoryItem() {
		
	}
	
	
	public void deleteInventoryItem() {
		
	}
}