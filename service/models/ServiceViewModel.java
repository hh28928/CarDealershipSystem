package service.models;
import inventory.models.*;
import java.time.*;
import java.util.*;
import mailing.publishers.Publisher;
import mailing.brokers.MessageBroker;
import mailing.messages.Message;
import inventory.views.View;


public class ServiceViewModel implements Publisher
{
protected MessageBroker broker;
protected View currentView;

public ServiceViewModel(MessageBroker broker)
{
  this.broker = broker;
}

public void publish(MessageBroker mb, Message m)
{
  mb.sendMessage(m);
}

public void switchView(View v)
{
 currentView = v;
}

public void addAppointment(String email, String vin, String make, String model, String color, LocalDate date, String comments)
{
  
}

public void updateAppointment(String email, LocalDate date, String comments)
{
  
}

public void deleteAppointment(String email, LocalDate date)
{
  
}

private Set<ServiceAppointmentModel> loadServiceAppointments()
{
  return new HashSet<ServiceAppointmentModel>();
} 

private void renderView()
{
  
}

}