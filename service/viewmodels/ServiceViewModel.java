package service.viewmodels;
import inventory.models.*;
import java.time.*;
import java.util.*;
import mailing.publishers.Publisher;
import mailing.brokers.MessageBroker;
import mailing.messages.Message;
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
public void addAppointment(String email, String vin, String make, String model, String color, LocalDate date, String comments, int id)
{
  CarModel car = new CarModel(vin, make, model, color);
  ServiceAppointmentModel appt = new ServiceAppointmentModel(car, comments, date, email, id);
  appointments.add(appt);
}

public void updateAppointment(String email, LocalDate date, String comments)
{
  for(ServiceAppointmentModel appt : appointments)
  {
    if(appt.getEmail().equals(email))
    {
      ServiceAppointmentModel temp = appt;
      appointments.remove(appt);
      temp.updateDate(date);
      temp.updateComments(comments);
      appointments.add(temp);
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
  CarModel testCar = new CarModel("999","testmake","testmodel","red");
  for(int i = 0; i<5; i++)
  {
    appointments.add(new ServiceAppointmentModel(testCar,"TestAppointment #" + Integer.toString(i), LocalDate.now(), "Customer #" + Integer.toString(i), i));
  }
  
  return appointments;
} 

private void renderView()
{
  System.out.println(currentView.render());
}

}