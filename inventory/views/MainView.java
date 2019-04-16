package inventory.views;

import java.util.Set;
import java.lang.StringBuilder;
import inventory.views.InventoryCarRenderable;
import inventory.views.View;

public class MainView implements View {
	
	private Set<InventoryCarRenderable> renderItems;
	
	public MainView(Set<InventoryCarRenderable> items) {
		this.renderItems = items;
	}
	
	
	public String render() {
		StringBuilder response = new StringBuilder(renderItems.size() + " CARS IN CURRENT INVENTORY:\nRESULT #\t VIN\n");
		
		int counter = 1;
		for (InventoryCarRenderable car : renderItems) {
			response.append(counter++ + "\t\t" + car.toString() + "\n");	
		}
		return response.toString();
	}
}