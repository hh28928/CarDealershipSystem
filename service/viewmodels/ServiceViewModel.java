package service.viewmodels;
import inventory.models.*;
import java.time.*;
import java.util.*;
import mailing.publishers.Publisher;
import mailing.brokers.MessageBroker;
import mailing.messages.Message;
import mailing.subscribers.EmailAccount;
import inventory.views.View;
import service.models.ServiceAppointmentModel;


public class ServiceViewModel implements Publisher
{

protected MessageBroker broker;
protected View currentView;

private LinkedHashSet<ServiceAppointmentModel> appointments;

public ServiceViewModel(MessageBroker broker)
{
  this.broker = broker;
  appointments = new LinkedHashSet<ServiceAppointmentModel>();
}

public void publish(MessageBroker mb, Message m)
{
  mb.sendMessage(m);
}

public void switchView(View v)
{
 currentView = v;
 renderView();
}

//	public CarModel(String vin, String make, String model, String color) 
//  public ServiceAppointmentModel(CarModel c_model, String comments, LocalDate date, String email) 
public void addAppointment(String email, String vin, String make, String model, String color, LocalDate date, String comments)
{
  CarModel car = new CarModel(vin, make, model, color);
  ServiceAppointmentModel appt = new ServiceAppointmentModel(car, comments, date, email);
  appointments.add(appt);
  String[] emailFields = email.split("@");
  EmailAccount customerEmail = new EmailAccount(emailFields[0], emailFields[1], broker);
  customerEmail.subscribe(car.getVIN());
  publish(broker, new Message(car.getVIN(), "Your appointment for your " + car.getMake() + " " + car.getModel() + " with VIN " + car.getVIN() + " has been scheduled for " + date.toString()));
}

public void addAppointment(String email, String vin, String make, String model, String color, LocalDate date, String comments, int id)
{
  CarModel car = new CarModel(vin, make, model, color);
  ServiceAppointmentModel appt = new ServiceAppointmentModel(car, comments, date, email, id);
  appointments.add(appt);
}

public void updateAppointment(int id, ServiceAppointmentModel app)
{
  for(ServiceAppointmentModel appt : appointments)
  {
    if(appt.getID() == id)
    {
      appointments.remove(appt);
      appointments.add(app);
      return;
    }
  }
  System.out.println("Appointment not found.");
}

public void deleteAppointment(String email, LocalDate date)
{
  for(ServiceAppointmentModel appt : appointments)
  {
    if(appt.getEmail().equals(email) && appt.getDate().equals(date))
    {
      appointments.remove(appt);
      return;
    }
  }
  System.out.println("Appointment not found.");
}


//public CarModel(String vin, String make, String model, String color) 
//public ServiceAppointmentModel(CarModel c_model, String comments, LocalDate date, String email)
public LinkedHashSet<ServiceAppointmentModel> loadServiceAppointments()
{
  return appointments;
} 

private void renderView()
{
  System.out.println(currentView.render());
}

}