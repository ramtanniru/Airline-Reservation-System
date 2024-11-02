package airport;
import java.util.*;
public class Customer {
    private int customerId;
    private String name;
    private List<Booking> bookings;
    public Customer(int id,String name){
        this.customerId = id;
        this.name = name;
        this.bookings = new ArrayList<>();
    }
    public List<Booking> getBookingList(){
        return bookings;
    }

    public void viewBookings() {
        System.out.println(name+"'s bookings :");
        for(Booking b:bookings){
            Flight f = b.getFlight();
            System.out.println(f.getDepartureCity()+" --> "+f.getDestinationCity()+" at seat number: "+b.getSeatNumber());
        }
    }
    public int getId() {
        return customerId;
    }
    public String getName(){
        return name;
    }
    public void addBooking(Booking b){
        bookings.add(b);
    }
    public void cancelBooking(Booking b){
        bookings.remove(b);
    }
}
