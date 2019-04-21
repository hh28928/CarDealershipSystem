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

public ServiceAppointmentModel(CarModel c_model, String comments, LocalDate date, String email)
{
        this.comments = comments;
        this.c_model = c_model;
        this.date = date;
        this.email = email;
        this.apptID = this.hashCode();
}

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

public String getComments()
{
        return comments;  
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
        sb.append(String.format("%-" + 18 + "s", "(" + Integer.toString(apptID) + ")"));
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

//public ServiceAppointmentModel(CarModel c_model, String comments, LocalDate date, String email, int id)
public String getCSV()
{
        StringBuilder sb = new StringBuilder();
        sb.append(c_model.getVIN());
        sb.append("<|DELIMITER|>");
        sb.append(c_model.getMake());
        sb.append("<|DELIMITER|>");
        sb.append(c_model.getModel());
        sb.append("<|DELIMITER|>");
        sb.append(c_model.getColor());
        sb.append("<|DELIMITER|>");
        sb.append(comments);
        sb.append("<|DELIMITER|>");
        sb.append(Integer.toString(date.getYear()));
        sb.append("<|DELIMITER|>");
        sb.append(Integer.toString(date.getMonthValue()));
        sb.append("<|DELIMITER|>");
        sb.append(Integer.toString(date.getDayOfMonth()));
        sb.append("<|DELIMITER|>");
        sb.append(email);
        sb.append("<|DELIMITER|>");
        sb.append(Integer.toString(apptID));
        sb.append("<|DELIMITER|>");
        return sb.toString();
}

}