package finance.viewmodels;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
import inventory.views.View;
import finance.views.FinanceMainView;
import finance.models.FinanceCarModel;
import inventory.models.CarModel;



public class FinanceViewModel
{
    // the current view for the Finance Section
    private View currentView;

    private String data_location = "finance_data.csv";

    // list of current financed cars
    private Set<FinanceCarModel> financed_cars;
    
    // constructor
    public FinanceViewModel()
    {
        this.financed_cars = loadFinancedCars();
        currentView = new FinanceMainView(this,financed_cars);
    }

    public Set<FinanceCarModel> getFinanced_cars() {
        return financed_cars;
    }

    // switches the view to a different finance section view
    public void switchView (View view)
    {
        this.currentView = view;
        renderView();
    }
    
    public void addFinancedCar(CarModel car,int price, int amount_paid) throws IllegalArgumentException
    {
        
        try{
            FinanceCarModel new_car = new FinanceCarModel(car,price,amount_paid);
            FileWriter writer = new FileWriter(data_location,true);
            BufferedWriter bwr = new BufferedWriter(writer);
            bwr.write(car.getVIN());
            bwr.write(car.getMake());
            bwr.write(car.getModel());
            bwr.write(car.getColor());
            bwr.write(price);
            bwr.write(amount_paid);
            bwr.close();
            writer.close();
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
            this.financed_cars.remove(car);
        }
        catch (Exception e)
        {
            System.out.println("Sorry, but something was corupted with the information givin to remoFinancedCar");
        }
    }
    
    private Set<FinanceCarModel> loadFinancedCars()
    {
        Set<FinanceCarModel> cars = new HashSet<FinanceCarModel>();
        try(BufferedReader br = new BufferedReader(new FileReader(this.data_location))) {
            String line;
            while ((line = br.readLine()) != null)
            {
                String[] values = line.split(",");
                if (values[0].equals("vin")){continue;}
                else{
                    CarModel temp_car = new CarModel(values[0],values[1],values[2],values[3]);
                    FinanceCarModel temp_finance = new FinanceCarModel(temp_car,Integer.parseInt(values[4]),Integer.parseInt(values[5]));
                    this.financed_cars.add(temp_finance);
                }
            }
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