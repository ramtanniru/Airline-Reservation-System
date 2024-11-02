package airport;
import java.util.*;

public class InternationalFlight extends Flight{
    private String InternationalLicense;
    public InternationalFlight(int id,String from,String to,Date date,int availableSeats,double price,String license) {
        super(id,from,to,date,availableSeats,price);
        this.InternationalLicense = license;
    }

    public String getLicense() {
        return InternationalLicense;
    }
    public void displayInfo(){
        System.out.println("International flight "+getFlightId()+": "+getDepartureCity()+" to "+getDestinationCity()+" with license number "+InternationalLicense); 
    }
}