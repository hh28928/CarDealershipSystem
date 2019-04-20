package finance.models;

import java.util.*;

public class PaymentModel
{
    
    protected int amount;
    protected Date date;
    
    public PaymentModel( int amount, Date date)
    {
        this.amount = amount;
        this.date = date;
    }
    
    public int getAmount() { return this.amount;}
    public Date getDate()  { return this.date;}
    
}