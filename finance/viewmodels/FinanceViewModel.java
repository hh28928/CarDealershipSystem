package finance.viewmodels;

import java.util.*;
import inventory.views.View;
import finance.views.FinanceMainView;
import finance.model.FinanceCarModel;
import inventory.models.CarModel;



public class FinanceViewModel implements View
{
    // the current view for the Finance Section
    private View currentView;
    
    // list of current financed cars
    Set<FinanceCarModel> financed_cars;
    
    // constructor
    public FinanceViewModel()
    {
        this.financed_cars = loadFinancedCars();
        currentView = new FinanceMainView(this,financed_cars);
    }
    
    // switches the view to a different finance section view
    public void switchView (View view)
    {
        this.currentView = view;
        renderView();
    }
    
    public void addFinancedCar(CarModel car,int price) throws IllegalArgumentException
    {
        
        try{
            FinanceCarModel new_car = new FinanceCarModel(car,price);
            this.financed_cars.add(new_car);
        }
        catch (Exception e)
        {
            System.out.println("Sorry, but something was corupted with the information givin to addFinancedCar");
        }
        
    }
    
    public void deleteFinancedCar(FinanceCarModel car)
    {
        try{
            this.financed_cars.remove(new_car);
        }
        catch (Exception e)
        {
            System.out.println("Sorry, but something was corupted with the information givin to remoFinancedCar");
        }
    }
    
    private Set<FinanceCarModel> loadFinancedCars()
    {
        Set<FinanceCarModel> cars = new HashSet<FinanceCarModel>();
        try {
            CarModel car = new CarModel("0XV135ND234", "Honda", "Civic", "Blue");
            FinanceCarModel fin_car = new FinanceCarModel(car,20000);
			cars.add(fin_car);
		} catch (Exception e) {
			System.out.println("Error adding vehicle to financed cars: " + e.getMessage());
		}
		return cars;
	}
    private void renderView() 
    {
		System.out.println(currentView.render());
	}
    
    
}