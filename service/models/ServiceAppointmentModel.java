package service.models;
import inventory.models.CarModel;
import java.time.*;

public class ServiceAppointmentModel
{
protected int apptID;
protected String comments;
protected CarModel c_model;
protected LocalDate date;
protected String email;

public ServiceAppointmentModel(CarModel c_model, String comments, LocalDate date, String email, int id)
{
        this.comments = comments;
        this.c_model = c_model;
        this.date = date;
        this.email = email;
        this.apptID = id;
}

public int getID()
{
  return apptID;
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

public void updateComments(String comments)
{
        this.comments = comments;
}

public void updateEmail(String email)
{
        this.email = email;
}

public String getEmail()
{
        return email;
}

public String toString()
{
        StringBuilder sb = new StringBuilder();
        sb.append("(" + Integer.toString(apptID) + ")    ");
        sb.append("[");
        sb.append(date);
        sb.append("]  ");
        sb.append(email);
        sb.append(" (");
        sb.append(c_model.getMake());
        sb.append("  ");
        sb.append(c_model.getModel());
        sb.append(")");
        return sb.toString();
}

}