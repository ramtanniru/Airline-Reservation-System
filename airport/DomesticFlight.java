package airport;
import java.util.*;
public class DomesticFlight extends Flight{
    public DomesticFlight(int id,String from,String to,Date date,int availableSeats,double price) {
        super(id,from,to,date,availableSeats,price);
    }
    public void displayInfo(){
        System.out.println("Domestic flight "+getFlightId()+": "+getDepartureCity()+" to "+getDestinationCity()); 
    }
}