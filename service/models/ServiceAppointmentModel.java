package service.models;
import inventory.models.*;
import java.time.*;

public class ServiceAppointmentModel
{
protected String comments;
protected CarModel c_model;
protected LocalDate date;
protected String email;

public ServiceAppointmentModel(CarModel c_model, String comments, LocalDate date, String email)
{
        this.comments = comments;
        this.c_model = c_model;
        this.date = date;
        this.email = email;
}

public CarModel getCar()
{
        return this.c_model;
}

public LocalDate getDate()
{
        return this.date;
}

public void updateDate(LocalDate date)
{
        this.date = date;
}

public void udpateComments(String comments)
{
        this.comments = comments;
}

public void updateEmail(String email)
{
        this.email = email;
}

}