package airport;
import java.util.*;
interface flightType{
    void displayInfo();
}
public abstract class Flight implements flightType{
    private int flightId;
    private String departureCity;
    private String destinationCity;
    private Date date;
    private int availableSeats;
    private double price;
    public Flight(int id,String from,String to,Date date,int availableSeats,double price){
        this.flightId = id;
        this.departureCity = from;
        this.destinationCity = to;
        this.date = date;
        this.availableSeats = availableSeats;
        this.price = price;
    }
    public int getFlightId() {
        return flightId;
    }
    public String getDepartureCity() {
        return departureCity;
    }
    public String getDestinationCity() {
        return destinationCity;
    }
    public int getAvailableSeats() {
        return availableSeats;
    }
    public Date getDate() {
        return date;
    }
    public double getPrice() {
         return price;
    }


    public void bookSeat() {
        if(availableSeats>0){
            availableSeats--;
        }
    }
    public void cancelSeat() {
        availableSeats++;
    }
    
    public abstract void displayInfo();
}

