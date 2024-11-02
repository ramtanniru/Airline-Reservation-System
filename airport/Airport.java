package airport;
import java.util.*;
public class Airport {
    private Map<Integer,Customer> customers;
    private Map<Integer,Flight> flights;

    public Airport() {
        this.customers = new HashMap<>();
        this.flights = new HashMap<>();
    }

    public void addFlight(Flight f){
        int id = f.getFlightId();
        flights.put(id,f);
    }
    public void addCustomer(Customer c){
        int id = c.getId();
        customers.put(id,c);
    }

    public void bookFlight(int cId,int fId){
        Customer c = customers.get(cId);
        Flight f = flights.get(fId);
        if(c!=null && f!=null){
            Booking newBooking = new Booking(c, f);
            f.bookSeat();
            c.addBooking(newBooking);
            System.out.println("Booking confirmed for " + c.getName() + " on flight " + fId + " at seat number "+newBooking.getSeatNumber());
        }
        else{
            System.out.println("Booking failed for flight " + fId);
        }
    }

    public void cancelFlight(int cId,int fId){
        Customer c = customers.get(cId);
        Flight f = flights.get(fId);
        List<Booking> bookingList = c.getBookingList();
        for(Booking b : bookingList){
            if(b.getCustomer().getId()==cId && b.getFlight().getFlightId()==fId){
                f.cancelSeat();
                c.cancelBooking(b);
                return;
            }
        }
        System.out.println("No active booking found for cancellation.");
    }
    
}
