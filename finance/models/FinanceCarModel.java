package finance.models;

import java.util.*;
import inventory.models.CarModel;
public class FinanceCarModel
{
	protected String vin;
	protected String make;
	protected String model;
	protected String color;
	protected int price;
	protected int amount_paid;
	protected List<PaymentModel> payments;
    protected CarModel car;
	public FinanceCarModel(CarModel car, int price) throws IllegalArgumentException
	{
	  this.car = car;
	  if (price < 0){
		  throw new IllegalArgumentException("Sorry, price must be a positive number!");
	  }
	  this.price = price;
	  this.payments = new ArrayList<PaymentModel>(); 
	}

	public CarModel getCar() {return this.car;}
	public void setColor(String color)
	{
	  this.color = color;
	}
	public int getPrice()	 {return this.price;}
	public void setPrice(int price) throws IllegalArgumentException	
  	{
	  if (price < 0) {
		  throw new IllegalArgumentException("Sorry, price must be a positive number!");
	  }
	  this.price = price; 
	}		
	public List<PaymentModel> getPayments() {return this.payments;}
	public void addPayment(int payment) throws IllegalArgumentException
	{
	  if (payment < 0) {
		  throw new IllegalArgumentException("Sorry, payments must be a positive value!");
	  }
	  if (payment > (this.price - this.amount_paid)){
		  String message = String.format("You have paid more than you have too.\nYou only have %d left to pay", (this.price - this.amount_paid));
		  throw new IllegalArgumentException(message);
	  }
	  Date date = new Date();
	  PaymentModel paying = new PaymentModel(payment,date);
	  this.payments.add(paying);
	  this.amount_paid += payment;
	}	
    
}

