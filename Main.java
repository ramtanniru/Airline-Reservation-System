import airport.*;
import java.util.Date;
public class Main{
    public static void main(String[] args) {
        Airport airport = new Airport();
        
        Flight flight1 = new DomesticFlight(1,"Guntur","Hyderabad",new Date(),50,300.0);
        Flight flight2 = new InternationalFlight(2, "Kodad", "Muppala", new Date(), 30, 600.0, "A1234567");

        Customer cust1 = new Customer(0, "Ram");
        Customer cust2 = new Customer(1, "Sai");

        airport.addFlight(flight1);
        airport.addFlight(flight2);

        airport.addCustomer(cust1);
        airport.addCustomer(cust2);

        airport.bookFlight(1, 2);
        airport.bookFlight(0, 2);
        airport.bookFlight(1, 1);

        cust1.viewBookings();
        cust2.viewBookings();
        
        airport.cancelFlight(1, 1);
        airport.bookFlight(0, 1);
        cust1.viewBookings();
        cust2.viewBookings();
    }
}